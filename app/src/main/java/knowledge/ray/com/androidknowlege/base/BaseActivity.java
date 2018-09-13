package knowledge.ray.com.androidknowlege.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import knowledge.ray.com.androidknowlege.MyApplication;

/**
 * Created by wangya3 on 2018/9/7.
 *
 */

public abstract class BaseActivity<T extends Precenter> extends AppCompatActivity implements BaseView{
    protected T mPresenter;
    protected Activity mContext;
    private Unbinder mUnbinder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutView());
        mUnbinder = ButterKnife.bind(this);
        mContext = this;
        createPrecenter();
        if (mPresenter != null)
            mPresenter.attachView(this);
        MyApplication.getInstance().addActivity(this);
        initView();
        initEventAndData();
    }

    protected abstract void initView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.detachView();
        mUnbinder.unbind();
        MyApplication.getInstance().removeActivity(this);
    }

    protected abstract void createPrecenter();

    protected abstract int getLayoutView();

    protected abstract void initEventAndData();
}
