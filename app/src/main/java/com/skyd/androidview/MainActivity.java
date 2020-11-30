package com.skyd.androidview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.skyd.androidview.fragment.FragmentDemoActivity;
import com.skyd.androidview.homework.Level2Activity;
import com.skyd.androidview.homework.Level3Activity;
import com.skyd.androidview.recyclerviewdemo.RecyclerViewActivity;
import com.skyd.androidview.tablayout.TabLayoutDemoActivity;
import com.skyd.androidview.viewpagerdemo.ViewPagerActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnRv;
    private Button btnVp;
    private Button btnFragment;
    private Button btnTabLayout;
    private Button btnHomework2;
    private Button btnHomework3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRv = findViewById(R.id.btn_rv);
        btnVp = findViewById(R.id.btn_vp);
        btnFragment = findViewById(R.id.btn_fragment2);
        btnTabLayout = findViewById(R.id.btn_tab_layout);
        btnHomework2 = findViewById(R.id.btn_homework2);
        btnHomework3 = findViewById(R.id.btn_homework3);

        btnRv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));
            }
        });

        btnVp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ViewPagerActivity.class));
            }
        });

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FragmentDemoActivity.class));
            }
        });

        btnTabLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TabLayoutDemoActivity.class));
            }
        });

        btnHomework2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Level2Activity.class));
            }
        });

        btnHomework3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Level3Activity.class));
            }
        });
    }
}