package codebase.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.threeten.bp.LocalTime;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import codebase.services_online.adapter.LocalTimeConverter;
import codebase.services_online.common.HttpLoggingInterceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/6/2017.
 */

public class DefaultNetworkProvider implements NetworkProvider {

    private Map<String, String> headers;

    public DefaultNetworkProvider() {
        headers = new HashMap<>();
    }

    @Override
    public NetworkProvider addDefaultHeader() {
        addHeader("Content-Type", "application/json");
        return this;
    }

    @Override
    public NetworkProvider addHeader(String key, String value) {
        headers.put(key, value);
        return this;
    }

    @Override
    public Gson createConverter() {
        return new GsonBuilder()
                .registerTypeAdapter(LocalTime.class, new LocalTimeConverter())
                .create();
    }

    @Override
    public <T> T provideApi(String baseUrl, Class<T> service) {

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(30, TimeUnit.SECONDS);
        builder.readTimeout(30, TimeUnit.SECONDS);
        builder.writeTimeout(30, TimeUnit.SECONDS);
        builder.addInterceptor(chain -> {
            Request.Builder requestBuilder = chain.request().newBuilder();
            if (headers.size() == 0) {
                addDefaultHeader();
            }
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                requestBuilder.addHeader(entry.getKey(), entry.getValue());
            }
            return chain.proceed(requestBuilder.build());
        });

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.addInterceptor(interceptor);

        OkHttpClient okHttpClient = builder.build();
        Retrofit retrofitAdapter = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(createConverter()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build();

        return retrofitAdapter.create(service);
    }
}
