package com.gnguyen.android.hanasu;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phrases_activity);
        // Up button on ActionBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Find the view pager that will allow user to swipe between fragments
        ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager);

        // create an adapter that shows which fragment should be displayed for each page
        FragmentPageViewer adapter = new FragmentPageViewer(getSupportFragmentManager(), this);

        // set the adapter onto the ViewPager
        viewPager.setAdapter(adapter);

        // set up sliding title tab
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }
}
