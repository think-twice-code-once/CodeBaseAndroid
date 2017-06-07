package dagger2.codebase.network;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/6/2017.
 */

public interface NetworkProvider {

    NetworkProvider addDefaultHeader();

    NetworkProvider addHeader(String key, String value);

    <T> T provideApi(String baseUrl, final Class<T> service);
}
