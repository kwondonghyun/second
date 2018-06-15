package com.example.com.next;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case  0 : return  new OneFragment();
            case  1 : return new TwoFragment();
            case  2 : return new ThreeFragment();
        }
        return new OneFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
