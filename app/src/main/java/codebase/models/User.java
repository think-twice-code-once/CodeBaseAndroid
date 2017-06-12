package codebase.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/7/2017.
 */

public class User implements Serializable {

    @SerializedName("username")
    private String username;

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("email")
    private String email;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
