package com.skyd.androidview.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.skyd.androidview.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<RvData> list = new ArrayList<>();
    private RvAdapter rvAdapter = new RvAdapter(list);
    private Button btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = findViewById(R.id.rv_demo);
        btnDelete = findViewById(R.id.btn_delete);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.remove(0);
                rvAdapter.notifyDataSetChanged();
            }
        });

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(rvAdapter);

        list.add(new RvData("项目1"));
        list.add(new RvData("项目2"));
        list.add(new RvData("项目3"));
        list.add(new RvData("项目4"));
        list.add(new RvData("项目5"));
        list.add(new RvData("项目6"));
        list.add(new RvData("项目7"));
        list.add(new RvData("项目8"));
        list.add(new RvData("项目9"));
        list.add(new RvData("项目10"));
        list.add(new RvData("项目11"));
        list.add(new RvData("项目12"));
        list.add(new RvData("项目13"));
        list.add(new RvData("项目14"));
        list.add(new RvData("项目15"));
        list.add(new RvData("项目16"));
        list.add(new RvData("项目17"));
        list.add(new RvData("项目18"));
        list.add(new RvData("项目19"));
        list.add(new RvData("项目20"));

        rvAdapter.notifyDataSetChanged();
    }
}