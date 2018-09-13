package knowledge.ray.com.androidknowlege.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wangya3 on 2018/9/12.
 */

public class CustomProgrecess extends View {
    public CustomProgrecess(Context context) {
        super(context);
    }

    public CustomProgrecess(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomProgrecess(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthSpe = MeasureSpec.getMode(widthMeasureSpec);//测量模式
        int heightSpe = MeasureSpec.getMode(heightMeasureSpec);
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);
        int widthes,heightes;
        if(widthSpe == MeasureSpec.EXACTLY){
            width = width/2;
        }else{

        }
    }
}
