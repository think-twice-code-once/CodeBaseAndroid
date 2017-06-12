package codebase.models;

import com.google.gson.annotations.SerializedName;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/7/2017.
 */

public class LoginRequest implements LoginRequestInterface {

    @SerializedName("userName")
    private String userName;

    @SerializedName("password")
    private String password;

    public LoginRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public void setUsername(String username) {
        this.userName = username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
