package com.example.olx_application;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdaper extends FragmentPagerAdapter {

    private int numofTabs;

    public PageAdaper(@NonNull FragmentManager fm, int numofTabs) {
        super(fm, numofTabs);
        this.numofTabs=numofTabs;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new All_Fragment();
            case  1:
                return new Buying_fragment();
            case  2:
                return new Selling_fragment();
                 default:

        }

        return null;
    }

    @Override
    public int getCount() {
        return numofTabs;
    }
}
