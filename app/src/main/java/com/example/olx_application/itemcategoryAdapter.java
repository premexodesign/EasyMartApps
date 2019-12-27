package com.example.olx_application;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.olx_application.ui.explore.Bikes.bike_main;
import com.example.olx_application.ui.explore.Books.books_main;
import com.example.olx_application.ui.explore.Cars.car_main;
import com.example.olx_application.ui.explore.Furniture.furniture_main;
import com.example.olx_application.ui.explore.Jobs.jobs_main;
import com.example.olx_application.ui.explore.Mobiles.mobile_main;
import com.example.olx_application.ui.explore.Electronics.electronic_main;
import com.example.olx_application.ui.explore.Fashion.fashion_main;
import com.example.olx_application.ui.explore.Properties.property_main;

public class itemcategoryAdapter extends ArrayAdapter<String> {

    Activity context;
    String[]names;
    int[]imgs;

    public itemcategoryAdapter(@NonNull Activity context, String[] names, int[] imgs) {
        super(context, R.layout.itemcategory,names);
        this.context = context;
        this.names = names;
        this.imgs = imgs;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View ca=inflater.inflate(R.layout.itemcategory,null,true);
        ImageView img=ca.findViewById(R.id.IMGMYGRIDVIEW);
        TextView txtview=ca.findViewById(R.id.TITLEMYGRIDVIEW);
        LinearLayout ll=ca.findViewById(R.id.CATEGORYLL);
        img.setImageResource(imgs[position]);
        txtview.setText(names[position]);

        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemname=names[position];
                switch (itemname)
                {
                    case "Property":
                        Intent intentproperty=new Intent(getContext(),property_main.class);
                        context.startActivity(intentproperty);
                    break;

                    case "Cars":
                        Intent intentcars=new Intent(getContext(), car_main.class);
                        context.startActivity(intentcars);
                        break;

                    case "Furniture":
                        Intent intentfurniture=new Intent(getContext(), furniture_main.class);
                        context.startActivity(intentfurniture);
                        break;

                    case "Jobs":
                        Intent intentjob=new Intent(getContext(), jobs_main.class);
                        context.startActivity(intentjob);
                        break;

                    case "Electronics & Appliances":
                        Intent intentelectronics=new Intent(getContext(), electronic_main.class);
                        context.startActivity(intentelectronics);
                        break;

                    case "Mobiles":
                        Intent intentmobile=new Intent(getContext(), mobile_main.class);
                        context.startActivity(intentmobile);
                        break;

                    case "Bikes":
                        Intent intentbikes=new Intent(getContext(), bike_main.class);
                        context.startActivity(intentbikes);
                        break;

                    case "Books , Sports & Hobbies":
                        Intent intentbooks=new Intent(getContext(), books_main.class);
                        context.startActivity(intentbooks);
                        break;

                    case "Fashion":
                        Intent intentfashion=new Intent(getContext(), fashion_main.class);
                        context.startActivity(intentfashion);
                        break;
                }

            }
        });


        return ca;
        //return super.getView(position, convertView, parent);
    }
}
