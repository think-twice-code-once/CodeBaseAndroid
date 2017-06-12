package codebase.network;

import com.google.gson.Gson;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/6/2017.
 */

public interface NetworkProvider {

    NetworkProvider addDefaultHeader();

    NetworkProvider addHeader(String key, String value);

    Gson createConverter();

    <T> T provideApi(String baseUrl, final Class<T> service);
}
