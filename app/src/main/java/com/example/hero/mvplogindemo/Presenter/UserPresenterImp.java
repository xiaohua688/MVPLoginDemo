package com.example.hero.mvplogindemo.Presenter;

import com.example.hero.mvplogindemo.Bean.UserBean;
import com.example.hero.mvplogindemo.Model.IUserModel;
import com.example.hero.mvplogindemo.Model.UserModelImp;
import com.example.hero.mvplogindemo.View.IUserView;

/**
 * Created by Hero on 17/8/22.
 */

public class UserPresenterImp implements IUserPresenter {

    private IUserModel userModel;
    private IUserView userView;

    public UserPresenterImp(IUserView userView) {
        this.userView = userView;
        userModel=new UserModelImp();
    }

    @Override
    public void saveUser() {
        userModel.saveUser(userView.getId(),userView.getName(),userView.getPassword());
    }

    @Override
    public void loadUser(int id) {
        UserBean userBean=userModel.loadUser(id);
        if(userBean!=null){
            userView.putName(userBean.getName());
            userView.putPassword(userBean.getPassWord());
        }
    }
}
