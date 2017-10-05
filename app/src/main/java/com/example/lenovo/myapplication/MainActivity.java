package com.example.lenovo.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.*;

/**
* 单选按钮
* */
public class MainActivity extends Activity {

    private RadioGroup radioGroup;
    private RadioButton maleradioButton;
    private RadioButton famaleradioBUtton;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageid);
        radioGroup = (RadioGroup) findViewById(R.id.radio);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == maleradioButton.getId()) {
                    System.out.println("选中了male");
                } else if (checkedId == famaleradioBUtton.getId()) {
                    System.out.println("选中了famale");
                }
            }
        });

        maleradioButton = (RadioButton) findViewById(R.id.button);
        famaleradioBUtton = (RadioButton) findViewById(R.id.button2);

    }

}
