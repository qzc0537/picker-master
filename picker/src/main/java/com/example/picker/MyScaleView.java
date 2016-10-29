package com.example.picker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/9/2 0002.
 */
public class MyScaleView extends View {

    private Paint paint;
    private int mWidth;
    private int mHeight;

    public MyScaleView(Context context) {
        super(context);
        init();
    }

    public MyScaleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyScaleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init() {
        paint = new Paint();
        paint.setColor(Color.parseColor("#7E7E7E"));
        paint.setAntiAlias(true);
        paint.setStrokeWidth(2);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mWidth = getWidth();
        mHeight = getHeight();
        // 画一条线
        canvas.drawLine(0f, mHeight, mWidth, mHeight, paint);
        Path path = new Path();
        path.moveTo(mWidth / 2, mHeight - 30);// 此点为多边形的起点
        path.lineTo(mWidth / 2 - 20, mHeight);
        path.lineTo(mWidth / 2 + 20, mHeight);
        path.close(); // 使这些点构成封闭的多边形
        canvas.drawPath(path, paint);
    }

    private int dp2px(int value) {
        float v = getContext().getResources().getDisplayMetrics().density;
        return (int) (v * value + 0.5f);
    }
}
