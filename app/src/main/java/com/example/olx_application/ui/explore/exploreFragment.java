package com.example.olx_application.ui.explore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx_application.R;
import com.example.olx_application.freshitemAdapter;
import com.example.olx_application.freshitemModel;
import com.example.olx_application.itemcategoryAdapter;
import com.example.olx_application.sparepartsAdapter;
import com.example.olx_application.sparepartsModel;

import java.util.ArrayList;
import java.util.List;

public class exploreFragment extends Fragment {

    private ExploreViewModel exploreViewmodel;
    List<sparepartsModel> lstspareparts;
    private RecyclerView myrecyclerview;

    private  View view;
    private GridView gv;
    itemcategoryAdapter ica;
    private String[]names={"Property","Cars","Furniture","Jobs","Electronics & Appliances","Mobiles","Bikes","Books,Sports & Hobbies",
                            "Fashion"};
    private  int[]imgs={R.drawable.propertiescategory,R.drawable.carscategory,R.drawable.furniturecategory,
            R.drawable.jobcategory,R.drawable.electronicscategory,R.drawable.mobilescategory,R.drawable.bikescategory,
            R.drawable.hobbiescategory,R.drawable.fashioncagory};


    List<freshitemModel> lstfreshitemModels;
    private RecyclerView myrcv;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        exploreViewmodel =
                ViewModelProviders.of(this).get(ExploreViewModel.class);
        view = inflater.inflate(R.layout.fragment_explore, container, false);

        gv=view.findViewById(R.id.GRIDVIEW1);
        ica=new itemcategoryAdapter(getActivity(),names,imgs);
        gv.setAdapter(ica);




        RecyclerView myrecyclerview=(RecyclerView)view.findViewById(R.id.RCV2);
        sparepartsAdapter sparepartsAdapter=new sparepartsAdapter(getContext(),lstspareparts);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        myrecyclerview.setAdapter(sparepartsAdapter);


        RecyclerView myrcv=(RecyclerView)view.findViewById(R.id.RCV3);
        freshitemAdapter freshitemAdapter=new freshitemAdapter(getContext(),lstfreshitemModels);
        myrcv.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        myrcv.setAdapter(freshitemAdapter);




        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstspareparts=new ArrayList<>();
        lstspareparts.add(new sparepartsModel("airbags Cover",R.drawable.airbagscover));
        lstspareparts.add(new sparepartsModel("Mobile Cover",R.drawable.mobilecovers));
        lstspareparts.add(new sparepartsModel("Car Tires",R.drawable.cartires));
        lstspareparts.add(new sparepartsModel("Car Music System",R.drawable.carmusicsystem));
        lstspareparts.add(new sparepartsModel("airbags Cover",R.drawable.airbagscover));
        lstspareparts.add(new sparepartsModel("Mobile Cover",R.drawable.mobilecovers));


        lstfreshitemModels=new ArrayList<>();
        lstfreshitemModels.add(new freshitemModel("Audi Cars",2100000,R.drawable.audicar));
        lstfreshitemModels.add(new freshitemModel("couple watch",5000,R.drawable.couplewatch));

    }
}