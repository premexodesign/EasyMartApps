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
import com.example.olx_application.ui.sell.PropertyForm.ForRent_ShopOffice;
import com.example.olx_application.ui.sell.PropertyForm.ForSale_ShopsOffice;
import com.example.olx_application.ui.sell.PropertyForm.LANDS_PLOT;
import com.example.olx_application.ui.sell.PropertyForm.PG_Guesthouse;
import com.example.olx_application.ui.sell.PropertyForm.forent_HP;
import com.example.olx_application.ui.sell.PropertyForm.forsale_HP;

public class Property_SellMain extends AppCompatActivity {

    ListView listView;
    String propertytitle[] = {"For sale: Houses & Apartments", "For Rent: Houses & Apartments", "Lands & Plots",
            "For Rent: Shops & Offices", "For Sale: Shops & Offices ", "PG & Guest Houses"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property__sell_main);

        listView = findViewById(R.id.LISTVIEW_PROPERTY);

        PropertyAdapter propertyAdapter = new PropertyAdapter(this, propertytitle);
        listView.setAdapter(propertyAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    /*Toast.makeText(Property_SellMain.this, "For sale: Houses & Apartments", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Property_SellMain.this, forsale_HP.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    /*Toast.makeText(Property_SellMain.this, "For Rent: Houses & Apartments", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Property_SellMain.this, forent_HP.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    /*Toast.makeText(Property_SellMain.this, "Lands & Plots", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Property_SellMain.this, LANDS_PLOT.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    /*Toast.makeText(Property_SellMain.this, "For Rent: Shops & Offices", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Property_SellMain.this, ForRent_ShopOffice.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    /*Toast.makeText(Property_SellMain.this, "For Sale: Shops & Offices", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Property_SellMain.this, ForSale_ShopsOffice.class);
                    startActivity(intent);
                }
                if (position == 5) {
                   /* Toast.makeText(Property_SellMain.this, "PG & Guest Houses", Toast.LENGTH_SHORT).show();*/

                    Intent intent=new Intent(Property_SellMain.this, PG_Guesthouse.class);
                    startActivity(intent);
                }

            }
        });

    }

    class PropertyAdapter extends ArrayAdapter<String> {

        Context context;
        String propertytitle[];

        public PropertyAdapter(Context context, String title[]) {
            super(context, R.layout.row_propertysell, R.id.TITLEPROPERTY, title);
            this.context = context;
            this.propertytitle = title;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row_propertysell, parent, false);
            TextView mytitle = row.findViewById(R.id.TITLEPROPERTY);

            mytitle.setText(propertytitle[position]);


            return row;


        }
    }
}