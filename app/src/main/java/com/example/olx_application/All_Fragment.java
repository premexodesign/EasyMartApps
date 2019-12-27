package com.example.olx_application;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.olx_application.ui.chats.ChatsFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class All_Fragment extends Fragment {

    Button explorebutton;
    View v;

    public All_Fragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
          v=inflater.inflate(R.layout.fragment_all, container, false);

        explorebutton=(Button)v.findViewById(R.id.BUTTON);

        explorebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),MainActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }

}
