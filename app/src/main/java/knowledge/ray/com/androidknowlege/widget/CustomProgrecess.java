package knowledge.ray.com.androidknowlege.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import knowledge.ray.com.androidknowlege.R;

/**
 * Created by wangya3 on 2018/9/12.
 */

public class CustomProgrecess extends View {
    Paint paint;
    int widthes, heightes;
    int max = 5;//总的星星数量
    int num;//选择的星星数
    int xLog;//动态画出选中物体
    int defaultColor;//默认颜色
    int checkColor;//选中颜色
    boolean isTouck;//是静态显示还是动态显示
    int backgroundR;

    public CustomProgrecess(Context context) {
        this(context,null);
    }
    public CustomProgrecess(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CustomProgrecess(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CustomProgrecess);
        max = ta.getInt(R.styleable.CustomProgrecess_defualtNum,5);
        xLog = ta.getInt(R.styleable.CustomProgrecess_checkNum,0);
        defaultColor = ta.getColor(R.styleable.CustomProgrecess_defualtColor,Color.GRAY);
        checkColor = ta.getColor(R.styleable.CustomProgrecess_checkColor,Color.GREEN);
        isTouck = ta.getBoolean(R.styleable.CustomProgrecess_isTouch,true);
        backgroundR = ta.getResourceId(R.styleable.CustomProgrecess_backgroundResouce,Color.GRAY);
        ta.recycle();

    }

    private void init() {
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(defaultColor);
        Log.e("qqq", "执行了。。。。。。");
        for (int i = 0; i < max; i++) {
            canvas.drawCircle(widthes / (max * 2) * ((2 * (i + 1) - 1)), heightes, widthes / (max * 2) - 10, paint);
        }
        paint.setColor(checkColor);
        for (int i = 0; i < xLog; i++) {
            canvas.drawCircle(widthes / (max * 2) * ((2 * (i + 1) - 1)), heightes, widthes / (max * 2) - 10, paint);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_MOVE) {
            Log.e("qqq", "当前坐标：" + event.getX() + "<--->" + event.getY());
            xLog = (int) event.getX() / (widthes / max);
            initPaint();
            return isTouch();
        } else if (event.getAction() == MotionEvent.ACTION_DOWN) {
            xLog = (int) event.getX() / (widthes / max);
            initPaint();
            return isTouch();
        } else {
            return isTouch();
        }
    }

    private boolean isTouch() {
        if(isTouck){
            this.invalidate();//刷新View
            return true;
        }else{
            return false;
        }
    }

    private void initPaint() {

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthSpe = MeasureSpec.getMode(widthMeasureSpec);//测量模式
        int heightSpe = MeasureSpec.getMode(heightMeasureSpec);
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);

        if (widthSpe == MeasureSpec.EXACTLY) {
            widthes = width;
        }

        if (heightSpe == MeasureSpec.EXACTLY) {
            heightes = height / 2;
        }
    }

    public void setTotal(int max) {
        this.max = max;
    }

    public void setNum(int num) {
        this.num = num;
    }


}
