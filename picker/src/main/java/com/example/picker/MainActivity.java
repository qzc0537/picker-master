package com.example.picker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements HorizontalPicker.OnItemClicked, HorizontalPicker.OnItemSelected {

    private HorizontalPicker picker;
    private int mCurrMode = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picker = (HorizontalPicker) findViewById(R.id.picker);
        // 设置数据类型及选中项 (0：卡路里100-2000 1：步数2000-20000 2：公里1-20)
        // 注：修改数据范围关注getData(type)方法
        picker.setDataType(1, "6000");
        picker.setOnItemClickedListener(this);
        picker.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemClicked(int index) {

    }

    @Override
    public void onItemSelected(String item) {
        if (mCurrMode == 0) {
            Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();
        } else if (mCurrMode == 1) {
            Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();
        } else if (mCurrMode == 2) {
            Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();
        }
    }
}
