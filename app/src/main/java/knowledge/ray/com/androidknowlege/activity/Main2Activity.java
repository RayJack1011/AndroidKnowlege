package knowledge.ray.com.androidknowlege.activity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import knowledge.ray.com.androidknowlege.R;
import knowledge.ray.com.androidknowlege.activity.main.MainContract;
import knowledge.ray.com.androidknowlege.activity.main.MainPresenterImpl;
import knowledge.ray.com.androidknowlege.base.BaseActivity;


public class Main2Activity extends BaseActivity<MainPresenterImpl> implements MainContract.Viewes {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<String> list = new ArrayList<>();
//        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void createPrecenter() {
        mPresenter = new MainPresenterImpl();
    }

    @Override
    protected int getLayoutView() {
        return R.layout.activity_main2;
    }

    @Override
    protected void initEventAndData() {

    }

    @Override
    public void showMsg(String msg) {

    }

    @Override
    public void showProgressDialog() {

    }

    @Override
    public void DissProgressDialog() {

    }

    @Override
    public void ShowToast(String message) {

    }
}
