package com.example.olx_application.ui.explore.Electronics;

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
import com.example.olx_application.itemsellAdapter;
import com.example.olx_application.ui.explore.Jobs.jobs_main;


import java.util.ArrayList;
import java.util.List;

public class electronic_main extends AppCompatActivity {

    ListView listView_electronics;
    String electronicslist[] = {"TVs, Vedio-Audio", "Kitchen & Other Appliances", "Computers & Laptops","Cameras & Lenses",
            "Games & Entertainment", "Fridge", "Computer Accessories", "Hard Disk,Printer & Monitors","ACs",
            "Washing Matchines","View All"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic_main);

        listView_electronics=findViewById(R.id.LISTVIEW_ELECTRONIC);
        setTitle("ELECTRONICS");

        electronicMainAdapter electronicMainAdapter = new electronicMainAdapter(this, electronicslist);
        listView_electronics.setAdapter(electronicMainAdapter);


        listView_electronics.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(electronic_main.this, "TVs, Vedio-Audio", Toast.LENGTH_SHORT).show();
                }

                if(position==1){
                    Toast.makeText(electronic_main.this, "Kitchen & Other Appliances", Toast.LENGTH_SHORT).show();
                }

                if(position==2){
                    Toast.makeText(electronic_main.this, "Computers & Laptops", Toast.LENGTH_SHORT).show();
                }

                if(position==3){
                    Toast.makeText(electronic_main.this, "Cameras & Lenses", Toast.LENGTH_SHORT).show();
                }

                if(position==4){
                    Toast.makeText(electronic_main.this, "Games & Entertainment", Toast.LENGTH_SHORT).show();
                }

                if(position==5){
                    Toast.makeText(electronic_main.this, "Fridge", Toast.LENGTH_SHORT).show();
                }

                if(position==6){
                    Toast.makeText(electronic_main.this, "Computer Accessories", Toast.LENGTH_SHORT).show();
                }

                if(position==7){
                    Toast.makeText(electronic_main.this, "Hard Disk,Printer & Monitors", Toast.LENGTH_SHORT).show();
                }

                if(position==8){
                    Toast.makeText(electronic_main.this, "ACs", Toast.LENGTH_SHORT).show();
                }

                if(position==9){
                    Toast.makeText(electronic_main.this, "Washing Matchines", Toast.LENGTH_SHORT).show();
                }

                if(position==10){
                    Toast.makeText(electronic_main.this, "View All", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }

    class electronicMainAdapter extends ArrayAdapter<String> {

        Context context;
        String electroniclist[];


        public electronicMainAdapter(@NonNull Context context, String list[] ) {
            super(context, R.layout.list_electronicmain, R.id.LISTELECTRONIC_MAIN,list);
            this.context=context;
            this.electroniclist=list;
        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(R.layout.list_electronicmain, parent, false);
            TextView mylist = view.findViewById(R.id.LISTELECTRONIC_MAIN);

            mylist.setText(electroniclist[position]);

            return view;

        }
    }


    }
