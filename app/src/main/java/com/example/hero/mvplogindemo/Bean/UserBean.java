package com.example.hero.mvplogindemo.Bean;

/**
 * Created by Hero on 17/8/22.
 */

public class UserBean {
    private String name;
    private String passWord;

    public UserBean(String name, String passWord) {
        this.name = name;
        this.passWord = passWord;
    }

    public String getName() {

        return name;
    }

    public String getPassWord() {
        return passWord;
    }
}
