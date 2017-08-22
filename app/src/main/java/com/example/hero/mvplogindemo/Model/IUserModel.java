package com.example.hero.mvplogindemo.Model;

import com.example.hero.mvplogindemo.Bean.UserBean;

/**
 * Created by Hero on 17/8/22.
 */

public interface IUserModel {
    void saveUser(int id,String name,String passWord);
    UserBean loadUser(int id);
}
