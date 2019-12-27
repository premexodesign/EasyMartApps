package com.example.olx_application.ui.sell;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.olx_application.R;
import com.example.olx_application.itemcategoryAdapter;
import com.example.olx_application.itemsellAdapter;

public class sellFragment extends Fragment {

    private SellViewModel SellViewModel;

    private View view;
    private GridView gridView;
   itemsellAdapter itemsellAdapter;

   private String[]titles={"cars","Mobiles","Bikes","Electronics & Appliance","Furniture","Properties",
           "Books,Sports & Hobbies","More Categories"};

   private  int[]imgss={R.drawable.carsicon,R.drawable.mobileicon,R.drawable.bikeicon,R.drawable.electronicicon,
                        R.drawable.furnitureicon,R.drawable.propertiesicon,R.drawable.booksicon,R.drawable.categoryicon};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SellViewModel =
                ViewModelProviders.of(this).get(SellViewModel.class);
         view = inflater.inflate(R.layout.fragment_sell, container, false);

        gridView=view.findViewById(R.id.MYGRIDVIEW);
        itemsellAdapter=new itemsellAdapter(getActivity(),titles,imgss);
        gridView.setAdapter(itemsellAdapter);


        SellViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return view;
    }
}