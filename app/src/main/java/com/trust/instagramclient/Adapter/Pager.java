package com.trust.instagramclient.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.trust.instagramclient.Fragment.Fragment1;
import com.trust.instagramclient.Fragment.Fragment2;
import com.trust.instagramclient.Fragment.Fragment3;

public class Pager extends FragmentStatePagerAdapter {
    int tabCount;

    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragment1 tab1 = new Fragment1();
                Log.i("Click","1");
                return tab1;
            case 1:
                Fragment2 tab2 = new Fragment2();
                Log.i("Click","2");
                return tab2;
            case 2:
                Fragment3 tab3 = new Fragment3();
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
