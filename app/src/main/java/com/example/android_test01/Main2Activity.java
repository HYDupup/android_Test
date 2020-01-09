package com.example.android_test01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button bt = findViewById(R.id.btn_test);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(getResources().getColor(android.R.color.background_light));

                Intent intent = new Intent();
                intent.setClass(Main2Activity.this,Test01.class);
                startActivity(intent);


            }
        });

        Button bt1 = new Button(this);
        bt1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
//        lv_root
        bt1.setText("hhhhhhhhashaha");
        bt1.setPadding(100,300,0,0);
        bt1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(Main2Activity.this,"hhhhh", Toast.LENGTH_SHORT).show();

                return false;
            }
        });


        LinearLayout linear = findViewById(R.id.lv_root);
        linear.addView(bt1);

    }

    @Override
        protected void onPause() {
            super.onPause();
    }
}
