package com.skyd.androidview.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.skyd.androidview.R;
import com.skyd.androidview.fragment.My2Fragment;
import com.skyd.androidview.fragment.MyFragment;
import com.skyd.androidview.viewpagerdemo.VpAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabLayoutDemoActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    List<Fragment> fragmentList = new ArrayList<>();
    List<String> fragmentTitle = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout_demo);

        tabLayout = findViewById(R.id.tl_tab_layout);
        viewPager = findViewById(R.id.vp_tab_layout);

        fragmentTitle.add("碎片1");
        fragmentTitle.add("碎片2");
        fragmentList.add(new MyFragment());
        fragmentList.add(new My2Fragment());

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),
                ViewPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Toast.makeText(getApplicationContext(), R.string.selected_string, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //当选项卡变成未选中状态时调用
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                //当用户再次选择已选中的选项卡时调用。可以在这里刷新页面，实现点击选项卡后更新页面信息
            }
        });
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        ViewPagerAdapter(FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle.get(position);
        }
    }
}