package codebase.services_online.authentication;

import codebase.models.LoginRequest;
import codebase.models.User;
import rx.Observable;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/8/2017.
 */

public interface AuthenticationService {
    Observable<User> login(LoginRequest loginRequest);
}
