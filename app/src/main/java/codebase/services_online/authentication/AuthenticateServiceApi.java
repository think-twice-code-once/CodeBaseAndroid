package codebase.services_online.authentication;

import codebase.models.LoginRequest;
import codebase.models.User;
import codebase.services_online.common.RestResponseMessage;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/7/2017.
 */

public interface AuthenticateServiceApi {

    @POST("users/login")
    Observable<RestResponseMessage<User>> login(@Body LoginRequest loginRequest);

}
