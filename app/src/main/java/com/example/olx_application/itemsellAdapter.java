package com.example.olx_application;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx_application.ui.sell.Bike_SellMain;
import com.example.olx_application.ui.sell.Books_SellMain;
import com.example.olx_application.ui.sell.Car_SellMain;
import com.example.olx_application.ui.sell.Electronic_SellMain;
import com.example.olx_application.ui.sell.Furniture_SelMain;
import com.example.olx_application.ui.sell.Mobile_SellMain;
import com.example.olx_application.ui.sell.Property_SellMain;

import java.util.List;

public class itemsellAdapter extends ArrayAdapter<String> {

    Activity context;
    String[]titles;
    int[]imgss;


    public itemsellAdapter(@NonNull Activity context, String[] titles, int[] imgss) {
        super(context, R.layout.itemsell,titles);
        this.context = context;
        this.titles = titles;
        this.imgss = imgss;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View caa = inflater.inflate(R.layout.itemsell, null, true);
        ImageView img = caa.findViewById(R.id.IMGITEMSELL);
        TextView txtview = caa.findViewById(R.id.TXTITEMSELL);
        LinearLayout ll = caa.findViewById(R.id.LLSELLITEM);
        img.setImageResource(imgss[position]);
        txtview.setText(titles[position]);

        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemname = titles[position];
                switch (itemname) {
                   case "cars":
                       Intent intentcar=new Intent(getContext(), Car_SellMain.class);
                       context.startActivity(intentcar);
                       break;

                    case  "Mobiles":
                        Intent intentmobile=new Intent(getContext(), Mobile_SellMain.class);
                        context.startActivity(intentmobile);
                        break;


                    case  "Bikes":
                        Intent intentbike=new Intent(getContext(), Bike_SellMain.class);
                        context.startActivity(intentbike);
                        break;

                    case  "Electronics & Appliance":
                        Intent intentelectronic=new Intent(getContext(), Electronic_SellMain.class);
                        context.startActivity(intentelectronic);
                        break;


                    case  "Furniture":
                        Intent intentfurniture =new Intent(getContext(), Furniture_SelMain.class);
                        context.startActivity(intentfurniture);
                        break;


                   case  "Properties":
                        Intent intenteproperty=new Intent(getContext(), Property_SellMain.class);
                        context.startActivity(intenteproperty);
                        break;

                    case  "Books,Sports & Hobbies":
                        Intent intentbooks=new Intent(getContext(), Books_SellMain.class);
                        context.startActivity(intentbooks);
                        break;

                 /*   case  "More Categories":
                        Intent intentbike=new Intent(getContext(), Bike_SellMain.class);
                        context.startActivity(intentbike);
                        break;*/
                }

            }
        });


        return caa;
    }
}
