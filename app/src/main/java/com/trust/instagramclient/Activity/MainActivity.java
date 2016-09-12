package com.trust.instagramclient.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.trust.instagramclient.Adapter.Pager;
import com.trust.instagramclient.R;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener, ViewPager.OnPageChangeListener{
    private ViewPager viewpager;
    private TabLayout tabLayout;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    void init() {
        layoutBind();
        setToolbar();
        setTabLayout();
    }

    void layoutBind() {
        viewpager = (ViewPager) findViewById(R.id.main_viewpager);
        tabLayout = (TabLayout) findViewById(R.id.main_tablayout);
        tabLayout.setOnTabSelectedListener(this);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
    }


    void setToolbar() {
        toolbar.setTitle("인스타그램");
        setSupportActionBar(toolbar);
    }

    void setTabLayout() {
        tabLayout.addTab(tabLayout.newTab().setText("친구"));
        tabLayout.addTab(tabLayout.newTab().setText("지역"));
        tabLayout.addTab(tabLayout.newTab().setText("대화"));

        Pager adapter = new Pager(getSupportFragmentManager(), tabLayout.getTabCount());
        viewpager.setOnPageChangeListener(this);
        viewpager.setAdapter(adapter);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewpager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
