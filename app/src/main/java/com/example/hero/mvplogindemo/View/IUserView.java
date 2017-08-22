package com.example.hero.mvplogindemo.View;

/**
 * Created by Hero on 17/8/22.
 */

public interface IUserView {
    int getId();

    String getName();

    String getPassword();

    void putName(String name);

    void putPassword(String passWord);
}
