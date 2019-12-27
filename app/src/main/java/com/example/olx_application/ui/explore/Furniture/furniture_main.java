package com.example.olx_application.ui.explore.Furniture;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;
import com.example.olx_application.ui.explore.Cars.car_main;

public class furniture_main extends AppCompatActivity {


    ListView listView_furniture;
    String furniturelist[] = {"Sofa & Dining", "Beds & wardrobes", "Home Decore & Garden","Kids Furniture","Other Household items",
                            "View all"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture_main);

        listView_furniture=findViewById(R.id.LISTVIEW_FURNITURE_MAIN);

        setTitle("CARS");

        FurnitureMainAdapter furnitureMainAdapter = new FurnitureMainAdapter(this, furniturelist);
        listView_furniture.setAdapter(furnitureMainAdapter);

        listView_furniture.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(furniture_main.this, "Sofa & Dining", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Toast.makeText(furniture_main.this, "Beds & wardrobes", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Toast.makeText(furniture_main.this, "Home Decore & Garden", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Toast.makeText(furniture_main.this, "Kids Furniture", Toast.LENGTH_SHORT).show();
                }
                if (position == 4) {
                    Toast.makeText(furniture_main.this, "Other Household items", Toast.LENGTH_SHORT).show();
                }

                if (position == 5) {
                    Toast.makeText(furniture_main.this, "View all", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }

    class FurnitureMainAdapter extends ArrayAdapter<String> {

        Context context;
        String furniturelist[];


        public FurnitureMainAdapter(@NonNull Context context, String list[]) {
            super(context, R.layout.list_furnituremain, R.id.LISTFURNITURE_MAIN,list);
            this.context=context;
            this.furniturelist=list;
        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(R.layout.list_furnituremain, parent, false);
            TextView mylist = view.findViewById(R.id.LISTFURNITURE_MAIN);

            mylist.setText(furniturelist[position]);

            return view;

        }
    }
    }
