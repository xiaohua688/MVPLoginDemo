package com.example.hero.mvplogindemo.Model;

import android.util.SparseArray;

import com.example.hero.mvplogindemo.Bean.UserBean;

/**
 * Created by Hero on 17/8/22.
 */

public class UserModelImp implements IUserModel {
    private SparseArray<UserBean> array = new SparseArray<>();

    @Override
    public void saveUser(int id, String name, String passWord) {
        array.put(id, new UserBean(name, passWord));
    }

    @Override
    public UserBean loadUser(int id) {
        if (array.indexOfKey(id) >= 0)
            return array.get(id);
        else
            return null;
    }
}
