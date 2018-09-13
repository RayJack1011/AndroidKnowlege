package knowledge.ray.com.androidknowlege;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTouch;
import knowledge.ray.com.androidknowlege.base.BaseActivity;
import knowledge.ray.com.androidknowlege.widget.CustomProgrecess;

public class MainActivity extends BaseActivity {

    @BindView(R.id.onclick)
    CustomProgrecess onclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initView() {
        onclick.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
            }
        });
    }

    @OnClick(R.id.onclick)
    public void click(){
        Log.e("qqq","点击了小兄弟");
    }



    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    @Override
    protected void createPrecenter() {

    }

    @Override
    protected int getLayoutView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initEventAndData() {

    }

    @Override
    public void showMsg(String msg) {

    }
}
