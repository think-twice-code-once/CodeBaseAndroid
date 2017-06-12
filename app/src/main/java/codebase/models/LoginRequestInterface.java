package codebase.models;

/**
 * Created by kietngo on 5/30/2016.
 */
public interface LoginRequestInterface {
    String getUsername();

    void setUsername(String username);

    String getPassword();

    void setPassword(String password);
}
