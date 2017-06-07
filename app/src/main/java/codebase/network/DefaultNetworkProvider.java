package dagger2.codebase.network;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/6/2017.
 */

public class DefaultNetworkProvider implements NetworkProvider {

    private Map<String, String> headers;

    private DefaultNetworkProvider() {
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
    public <T> T provideApi(String baseUrl, Class<T> service) {

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(30, TimeUnit.SECONDS);
        builder.readTimeout(30, TimeUnit.SECONDS);
        builder.writeTimeout(30, TimeUnit.SECONDS);
        builder.addInterceptor(chain -> {
            Request.Builder requestBuilder = chain.request().newBuilder();
            if (headers.size() ==0) {
                addDefaultHeader();
            }
            for (Map.Entry<String, String> entry: headers.entrySet()) {
                requestBuilder.addHeader(entry.getKey(), entry.getValue());
            }
            return chain.proceed(requestBuilder.build());
        });

        OkHttpClient okHttpClient = builder.build();



        return null;
    }
}
