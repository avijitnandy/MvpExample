package com.w3xplorers.mvpexample.root;

import com.w3xplorers.mvpexample.login.LoginActivity;
import com.w3xplorers.mvpexample.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by DELL on 9/19/2017.
 */
@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity target);
}
