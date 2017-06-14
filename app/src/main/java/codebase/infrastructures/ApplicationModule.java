package codebase.infrastructures;

import codebase.annotations.ApplicationScope;
import codebase.network.DefaultNetworkProvider;
import codebase.network.NetworkProvider;
import codebase.services_online.authentication.AuthenticateServiceApi;
import codebase.services_online.authentication.AuthenticationService;
import codebase.services_online.authentication.DefaultAuthenticationService;
import codebase.util.Constants;
import dagger.Module;
import dagger.Provides;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/13/2017.
 */

@Module
public class ApplicationModule {

    @Provides
    @ApplicationScope
    public NetworkProvider provideNetworkProvider() {
        return new DefaultNetworkProvider();
    }

    @Provides
    @ApplicationScope
    public AuthenticationService provideAuthenticationService(NetworkProvider networkProvider) {
        AuthenticateServiceApi authenticateServiceApi = networkProvider
                .addDefaultHeader()
                .addHeader("Accept", "application/vnd.app.avb.mobile-v1+json")
                .provideApi(Constants.BASE_API_URL, AuthenticateServiceApi.class);
        return new DefaultAuthenticationService(authenticateServiceApi);
    }
}
