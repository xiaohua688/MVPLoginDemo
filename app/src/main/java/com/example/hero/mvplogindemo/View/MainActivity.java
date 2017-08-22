package com.example.hero.mvplogindemo.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.hero.mvplogindemo.Presenter.IUserPresenter;
import com.example.hero.mvplogindemo.Presenter.UserPresenterImp;
import com.example.hero.mvplogindemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements IUserView{

    @BindView(R.id.user_id)
    EditText user_id;
    @BindView(R.id.user_name)
    EditText user_name;
    @BindView(R.id.user_password)
    EditText user_password;

    private IUserPresenter userPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        userPresenter=new UserPresenterImp(this);
    }

    @OnClick({R.id.load_info_button,R.id.save_info_button})
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.save_info_button:
                userPresenter.saveUser();
                break;
            case R.id.load_info_button:
                userPresenter.loadUser(getId());
                break;
        }
    }


    @Override
    public int getId() {
        try {
            return Integer.parseInt(user_id.getText().toString());
        }catch (Exception e){
            return 0;
        }

    }

    @Override
    public String getName() {
        return user_name.getText().toString();
    }

    @Override
    public String getPassword() {
        return user_password.getText().toString();
    }

    @Override
    public void putName(String name) {
        user_name.setText(name);
    }

    @Override
    public void putPassword(String passWord) {
        user_password.setText(passWord);
    }
}
