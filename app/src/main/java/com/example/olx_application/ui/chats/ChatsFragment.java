package com.example.olx_application.ui.chats;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.olx_application.PageAdaper;
import com.example.olx_application.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class ChatsFragment extends Fragment {

    private ChatsViewModel ChatsViewModel;

    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter pagerAdapter;
    TabItem taball;
    TabItem tabbuying;
    TabItem tabselling;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ChatsViewModel =
                ViewModelProviders.of(this).get(ChatsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_chats, container, false);
        viewPager=root.findViewById(R.id.VIEWPAGER);
        tabLayout=root.findViewById(R.id.TABLAYOUT);
        taball=root.findViewById(R.id.TABALL);
        tabbuying=root.findViewById(R.id.BUYINGTAB);
        tabselling=root.findViewById(R.id.TABSLLING);


        pagerAdapter=new PageAdaper(getFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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
        });


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


       ChatsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });

        return root;
    }


}