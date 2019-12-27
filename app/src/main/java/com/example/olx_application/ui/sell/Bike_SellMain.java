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

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;
import com.example.olx_application.ui.sell.BikeForm.Bicycle_Form;
import com.example.olx_application.ui.sell.BikeForm.Motorcycle_Form;
import com.example.olx_application.ui.sell.BikeForm.Scooter_Form;

public class Bike_SellMain extends AppCompatActivity {


    ListView listView;
    String biketitle[]={"Motorcycle","Scooters","Spare Parts","Bicycles"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike__sell_main);

        listView=findViewById(R.id.LISTVIEW_BIKE);

       BikeAdapter adapter=new BikeAdapter(this,biketitle);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    /*Toast.makeText(Bike_SellMain.this, "Motorcycle", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Bike_SellMain.this, Motorcycle_Form.class);
                    startActivity(intent);
                }
                if (position == 1){
                    /*Toast.makeText(Bike_SellMain.this, "Scooters ", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Bike_SellMain.this, Scooter_Form.class);
                    startActivity(intent);
                }
                if(position == 2){
                    /*Toast.makeText(Bike_SellMain.this, "Spare Parts", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Bike_SellMain.this, Books_SellMain.Bike_Spareparts_Form.class);
                    startActivity(intent);
                }
                if (position ==3){
                    /*Toast.makeText(Bike_SellMain.this, "Bicycles", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Bike_SellMain.this, Bicycle_Form.class);
                    startActivity(intent);
                }

            }
        });

    }

    class BikeAdapter extends ArrayAdapter<String> {

        Context context;
        String biketitle[];

        public BikeAdapter( Context context,String title[]) {
            super(context, R.layout.row_bikesell,R.id.BIKETITLE,title);
            this.context=context;
            this.biketitle=title;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.row_bikesell,parent,false);
            TextView mytitle= row.findViewById(R.id.BIKETITLE);

            mytitle.setText(biketitle[position]);




            return row;



        }
    }
}
