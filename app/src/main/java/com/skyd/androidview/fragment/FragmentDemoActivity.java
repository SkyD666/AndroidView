package com.skyd.androidview.fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;

import com.skyd.androidview.R;

public class FragmentDemoActivity extends AppCompatActivity {
    MyFragment myFragment = new MyFragment();
    My2Fragment my2Fragment = new My2Fragment();
    Button btnFragment1;
    Button btnFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_demo);

        btnFragment1 = findViewById(R.id.btn_fragment1);
        btnFragment2 = findViewById(R.id.btn_fragment2);

        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();//开启事务
                transaction.replace(R.id.fl_fragment, my2Fragment);//替换
                transaction.commit();//提交
            }
        });

        btnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();//开启事务
                transaction.replace(R.id.fl_fragment, myFragment);//替换
                transaction.commit();//提交
            }
        });

        btnFragment1.callOnClick();
    }
}