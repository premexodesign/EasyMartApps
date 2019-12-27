package com.example.olx_application.ui.sell;

import android.content.Context;
import android.content.Intent;
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
import com.example.olx_application.ui.sell.ElectronicsForm.ACs;
import com.example.olx_application.ui.sell.ElectronicsForm.Camera;
import com.example.olx_application.ui.sell.ElectronicsForm.Compurer_laptops;
import com.example.olx_application.ui.sell.ElectronicsForm.Fridge;
import com.example.olx_application.ui.sell.ElectronicsForm.Games;
import com.example.olx_application.ui.sell.ElectronicsForm.Harddisk;
import com.example.olx_application.ui.sell.ElectronicsForm.Kitchen;
import com.example.olx_application.ui.sell.ElectronicsForm.Tv;
import com.example.olx_application.ui.sell.ElectronicsForm.comAccessories;
import com.example.olx_application.ui.sell.ElectronicsForm.washingMatchine;

public class Electronic_SellMain extends AppCompatActivity {

    ListView listView;
    String electronicstitle[] = {"TVs Vedio-Audio", "Kitchen & other Appliances", "Computer & Laptops", "Camera & Lenses", "Games & Entertainment",
            "Fridges", "Computer Accessories", "Hard Disks,printers & Monitors", "ACs", "Washing Matchine"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic__sell_main);


        listView = findViewById(R.id.LISTVIEW_ELECTRONIC);

        ElectronicAdapter adapter = new ElectronicAdapter(this, electronicstitle);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                   /* Toast.makeText(Electronic_SellMain.this, "TVs Vedio-Audio", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Electronic_SellMain.this, Tv.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    /*Toast.makeText(Electronic_SellMain.this, "Kitchen & other Appliances", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Electronic_SellMain.this, Kitchen.class);
                    startActivity(intent);
                }
                if (position == 2) {
                   /* Toast.makeText(Electronic_SellMain.this, "Computer & Laptops", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Electronic_SellMain.this, Compurer_laptops.class);
                    startActivity(intent);
                }
                if (position == 3) {
                   /* Toast.makeText(Electronic_SellMain.this, "Camera & Lenses", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Electronic_SellMain.this, Camera.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    /*Toast.makeText(Electronic_SellMain.this, "Games & Entertainment", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Electronic_SellMain.this, Games.class);
                    startActivity(intent);
                }
                if (position == 5) {
                   /* Toast.makeText(Electronic_SellMain.this, "Fridges", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Electronic_SellMain.this, Fridge.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    /*Toast.makeText(Electronic_SellMain.this, "Computer Accessories", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Electronic_SellMain.this, comAccessories.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    /*Toast.makeText(Electronic_SellMain.this, "Hard Disks,printers & Monitors", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Electronic_SellMain.this, Harddisk.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    /*Toast.makeText(Electronic_SellMain.this, "ACs", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Electronic_SellMain.this, ACs.class);
                    startActivity(intent);
                }
                if (position == 9) {
                   /* Toast.makeText(Electronic_SellMain.this, "Washing Matchine", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Electronic_SellMain.this, washingMatchine.class);
                    startActivity(intent);
                }

            }
        });

    }

    class ElectronicAdapter extends ArrayAdapter<String> {

        Context context;
        String electronicstitle[];

        public ElectronicAdapter(Context context, String title[]) {
            super(context, R.layout.row_electronicsell, R.id.ELECTRONICSTITLE, title);
            this.context = context;
            this.electronicstitle = title;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row_electronicsell, parent, false);
            TextView mytitle = row.findViewById(R.id.ELECTRONICSTITLE);

            mytitle.setText(electronicstitle[position]);


            return row;

        }
    }
}
