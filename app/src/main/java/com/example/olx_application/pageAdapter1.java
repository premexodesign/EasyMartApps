package com.example.olx_application;

import android.app.Activity;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pageAdapter1 extends FragmentPagerAdapter {

    private int numofTabs;

    public pageAdapter1(@NonNull FragmentManager fm, int numofTabs) {
        super(fm, numofTabs);
        this.numofTabs=numofTabs;

    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ADS_fragment();
            case  1:
                return new favourite_fragment();
            default:

        }

        return null;
    }

    @Override
    public int getCount() {
        return numofTabs;
    }

}