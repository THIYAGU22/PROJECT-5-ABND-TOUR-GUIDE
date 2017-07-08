package com.example.android.neyveliinfo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    // this is main activity which runs on the app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //view pager displays the current info about the place on those specific tabs
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        FragmentAdapter adapter = new FragmentAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        //sliding tabs allows us to scroll side by side
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
