package com.example.toolbar.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.toolbar.fragments.FirstFragment;
import com.example.toolbar.fragments.SecondFragment;
import com.example.toolbar.fragments.ThirdFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private int numberOfTabs;

    public PagerAdapter(FragmentManager fm, int tabs) {
        super(fm);
        this.numberOfTabs = tabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FirstFragment();

            case 1:
                return new SecondFragment();

            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
