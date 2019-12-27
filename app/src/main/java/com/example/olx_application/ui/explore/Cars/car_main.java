package com.example.olx_application.ui.explore.Cars;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx_application.R;
import com.example.olx_application.ui.explore.Properties.property_main;

import java.util.ArrayList;
import java.util.List;

public class car_main extends AppCompatActivity {

    ListView listView_car;
    String carlist[] = {"Cars", "Commercial Vehicles", "Spare Parts","Other Vehicles","View all"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_main);

        listView_car=findViewById(R.id.LISTVIEW_CAR_MAIN);

        setTitle("CARS");

        CarsMainAdapter carsMainAdapter = new CarsMainAdapter(this, carlist);
        listView_car.setAdapter(carsMainAdapter);

        listView_car.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(car_main.this, "Cars", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Toast.makeText(car_main.this, "Commercial Vehicles", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Toast.makeText(car_main.this, "Spare Parts", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Toast.makeText(car_main.this, "Other Vehicles", Toast.LENGTH_SHORT).show();
                }
                if (position == 4) {
                    Toast.makeText(car_main.this, "View all", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }

    class CarsMainAdapter extends ArrayAdapter<String> {

        Context context;
        String carlist[];


        public CarsMainAdapter(@NonNull Context context, String list[]) {
            super(context, R.layout.list_carsmain, R.id.LISTCARS_MAIN,list);
            this.context=context;
            this.carlist=list;
        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(R.layout.list_carsmain, parent, false);
            TextView mylist = view.findViewById(R.id.LISTCARS_MAIN);

            mylist.setText(carlist[position]);

            return view;

        }
    }

}




