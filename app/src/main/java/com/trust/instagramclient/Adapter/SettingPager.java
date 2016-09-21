package com.trust.instagramclient.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.trust.instagramclient.Fragment.SettingFragment1;
import com.trust.instagramclient.Fragment.SettingFragment2;
import com.trust.instagramclient.Fragment.SettingFragment3;

public class SettingPager extends FragmentStatePagerAdapter {
    int tabCount;

    public SettingPager(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SettingFragment1 tab1 = new SettingFragment1();
                Log.i("Click","1");
                return tab1;
            case 1:
                SettingFragment2 tab2 = new SettingFragment2();
                Log.i("Click","2");
                return tab2;
            case 2:
                SettingFragment3 tab3 = new SettingFragment3();
                Log.i("Click","2");
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
