package com.w3xplorers.mvpexample.login;

/**
 * Created by DELL on 9/19/2017.
 */

public interface LoginActivityMVP {

    interface View{
        String getFirstName();
        String getLastName();

        void showUserNotAvailable();
        void showInputerror();
        void showUserSavedMessage();

        void setFirstName(String fname);
        void setLastName(String lname);

    }

    interface Presenter{

        void setView(LoginActivityMVP.View view);

        void loginButtonClicked();

        void getCurrentUser();
    }

    interface Model{
        void createUser(String fname,String lname);

        User getUser();
    }
}
