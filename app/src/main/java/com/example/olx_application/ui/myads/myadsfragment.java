package com.example.olx_application.ui.myads;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.olx_application.PageAdaper;
import com.example.olx_application.R;
import com.example.olx_application.pageAdapter1;
import com.example.olx_application.ui.explore.ExploreViewModel;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class myadsfragment extends Fragment {

    private MyadsViewModel MyadsViewModel;

    TabLayout tabLayout1;
    ViewPager viewPager1;
    pageAdapter1 pagerAdapterr;
    TabItem tabads;
    TabItem tabfavourite;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MyadsViewModel =
                ViewModelProviders.of(this).get(MyadsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_myads, container, false);

        viewPager1=root.findViewById(R.id.VIEWPAGER1);
        tabLayout1=root.findViewById(R.id.TABLAYOUT1);
        tabads=root.findViewById(R.id.TABADS);
        tabfavourite=root.findViewById(R.id.TABFAVOURITES);

        pagerAdapterr=new pageAdapter1(getFragmentManager(),tabLayout1.getTabCount());
        viewPager1.setAdapter(pagerAdapterr);

        tabLayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager1.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        MyadsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}