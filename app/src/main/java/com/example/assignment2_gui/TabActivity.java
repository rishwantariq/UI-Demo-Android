package com.example.assignment2_gui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.assignment2_gui.ui.main.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);

        tabs.setupWithViewPager(viewPager);

         int[] imageResId = {
                R.drawable.tab1,
                R.drawable.tab2,
                R.drawable.tab3,
                R.drawable.tab4};

        for (int i = 0; i < imageResId.length; i++) {
            tabs.getTabAt(i).setIcon(imageResId[i]);
        }

    }
}