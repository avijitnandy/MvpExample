package com.w3xplorers.mvpexample.login;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DELL on 9/19/2017.
 */

@Module
public class LoginModule {
    @Provides
    public LoginActivityMVP.Presenter provideLoginActivityPresenter(LoginActivityMVP.Model model){
        return new LoginActivityPresenter(model);
    }

    @Provides
    public LoginActivityMVP.Model provideLoginActivityMode(LoginRepository repository){
        return  new LoginModel(repository);
    }

    @Provides
    public LoginRepository provideLoginRepository(){
        return new MemoryRepository();
    }
}
