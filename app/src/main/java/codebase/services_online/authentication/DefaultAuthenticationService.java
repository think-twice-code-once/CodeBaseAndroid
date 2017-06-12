package codebase.services_online.authentication;

import android.util.Log;

import codebase.models.LoginRequest;
import codebase.models.User;
import rx.Observable;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/8/2017.
 */

public class DefaultAuthenticationService implements AuthenticationService {

    private AuthenticateServiceApi authenticateServiceApi;

    public DefaultAuthenticationService(AuthenticateServiceApi authenticateServiceApi) {
        this.authenticateServiceApi = authenticateServiceApi;
    }

    @Override
    public Observable<User> login(LoginRequest loginRequest) {
        Log.d("Main2Activity", "Called login !");
        return authenticateServiceApi
                .login(loginRequest)
                .flatMap(userRestResponseMessage -> {
                    int i = 0;
                    Log.d("Main2Activity", "Call flat map !");
                    return Observable.just(userRestResponseMessage.getData());
                });
    }
}
