package com.example.olx_application.ui.explore.Bikes;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx_application.R;
import com.example.olx_application.ui.explore.Mobiles.mobile_main;

import java.util.ArrayList;
import java.util.List;

public class bike_main extends AppCompatActivity {

    ListView listView_bike;
    String bikelist[] = {"Motorcycles", "Scooters", "Spare Parts","Bicycles","View all"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike_main);

        listView_bike=findViewById(R.id.LISTVIEW_BIKE);

        setTitle("BIKES");

        BikeMainAdapter bikeMainAdapter = new BikeMainAdapter(this, bikelist);
        listView_bike.setAdapter(bikeMainAdapter);

        listView_bike.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(bike_main.this, "Motorcycles", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Toast.makeText(bike_main.this, "Scooters", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Toast.makeText(bike_main.this, "Spare Parts", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Toast.makeText(bike_main.this, "Bicycles", Toast.LENGTH_SHORT).show();
                }

                if (position == 4) {
                    Toast.makeText(bike_main.this, "View all", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    class BikeMainAdapter extends ArrayAdapter<String> {

        Context context;
        String bikelist[];


        public BikeMainAdapter(@NonNull Context context, String list[]) {
            super(context, R.layout.list_bikemain, R.id.LISTBIKE_MAIN,list);
            this.context=context;
            this.bikelist=list;
        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(R.layout.list_bikemain, parent, false);
            TextView mylist = view.findViewById(R.id.LISTBIKE_MAIN);

            mylist.setText(bikelist[position]);

            return view;

        }


    }
}
