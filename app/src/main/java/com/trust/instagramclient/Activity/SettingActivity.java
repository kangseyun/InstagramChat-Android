package com.trust.instagramclient.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.trust.instagramclient.Adapter.SettingPager;
import com.trust.instagramclient.R;

public class SettingActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener
, ViewPager.OnPageChangeListener {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        init();
    }

    private void init() {
        bind();
    }

    private void bind() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("마이룸");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.setting_viewpager);
        tabLayout = (TabLayout) findViewById(R.id.setting_tablayout);
        tabLayout.setOnTabSelectedListener(this);

        tabLayout.addTab(tabLayout.newTab().setText("프로필"));
        tabLayout.addTab(tabLayout.newTab().setText("앨범"));
        tabLayout.addTab(tabLayout.newTab().setText("담벼락"));

        SettingPager adapter = new SettingPager(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setOnPageChangeListener(this);
        viewPager.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.setting_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                finish();
                break;
            case R.id.shop:
                Log.i("Shop","shop");
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        tabLayout.setScrollPosition(position, positionOffset, true);

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
