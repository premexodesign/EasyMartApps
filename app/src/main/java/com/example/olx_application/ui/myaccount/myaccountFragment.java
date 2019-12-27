package com.example.olx_application.ui.myaccount;

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

import com.example.olx_application.R;
import com.example.olx_application.ui.explore.ExploreViewModel;

public class myaccountFragment extends Fragment {

    private MyaccountViewModel MyaccountViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MyaccountViewModel =
                ViewModelProviders.of(this).get(MyaccountViewModel.class);
        View root = inflater.inflate(R.layout.fragment_myaccount, container, false);
        final TextView textView = root.findViewById(R.id.text_myaccount);
        MyaccountViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}