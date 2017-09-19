package com.w3xplorers.mvpexample.root;

import android.app.Application;

import com.w3xplorers.mvpexample.login.LoginModel;
import com.w3xplorers.mvpexample.login.LoginModule;

import dagger.internal.DaggerCollections;

/**
 * Created by DELL on 9/19/2017.
 */

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
