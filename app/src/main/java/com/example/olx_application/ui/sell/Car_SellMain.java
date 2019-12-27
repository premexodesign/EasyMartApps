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
import com.example.olx_application.ui.sell.CarForm.SpareParts_Form;
import com.example.olx_application.ui.sell.CarForm.comercial_vehical_form;
import com.example.olx_application.ui.sell.CarForm.form_car;
import com.example.olx_application.ui.sell.CarForm.other_Vehicles_From;

public class Car_SellMain extends AppCompatActivity {

    ListView listView;
    String cartitle[]={"Cars","Commercial Vehical","Spare Parts","Other Vehicles"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car__sell_main);

        listView=findViewById(R.id.CAR_LISTVIEW);

        CarAdapter adapter=new CarAdapter(this,cartitle);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                   /* Toast.makeText(Car_SellMain.this, "cars", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Car_SellMain.this, form_car.class);
                    startActivity(intent);
                }
                if (position == 1){
                   /* Toast.makeText(Car_SellMain.this, "Commercial Vehical", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Car_SellMain.this, comercial_vehical_form.class);
                    startActivity(intent);
                }
                if(position == 2){
                    /*Toast.makeText(Car_SellMain.this, "Spare Parts", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Car_SellMain.this, SpareParts_Form.class);
                    startActivity(intent);
                }
                if (position ==3){
                   /* Toast.makeText(Car_SellMain.this, "Other Vehicles", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Car_SellMain.this, other_Vehicles_From.class);
                    startActivity(intent);
                }

            }
        });

    }

    class CarAdapter extends ArrayAdapter<String>{

        Context context;
        String cartitle[];

        public CarAdapter( Context context,String title[]) {
            super(context, R.layout.rowsell_car,R.id.CARLISTTITLE,title);
            this.context=context;
            this.cartitle=title;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.rowsell_car,parent,false);
            TextView mytitle= row.findViewById(R.id.CARLISTTITLE);

            mytitle.setText(cartitle[position]);




            return row;



        }
    }
}
