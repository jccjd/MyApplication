package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import static android.widget.Toast.LENGTH_LONG;

/**
*登陆首页
* */
public class MainActivity extends AppCompatActivity {

    private Button sign_in_button;
    private Button sign_out_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sign_in_button = (Button) findViewById(R.id.sign_in_button);
        sign_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "成功登陆", LENGTH_LONG).show();
            }
        });

    }

}
