package com.w3xplorers.mvpexample.login;

/**
 * Created by DELL on 9/19/2017.
 */

public interface LoginRepository {

    User getUser();

    void saveUser(User user);
}
