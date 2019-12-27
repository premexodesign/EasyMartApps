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
import com.example.olx_application.ui.sell.FurnitureForm.Beds;
import com.example.olx_application.ui.sell.FurnitureForm.HomeDecore;
import com.example.olx_application.ui.sell.FurnitureForm.KidsFurniture;
import com.example.olx_application.ui.sell.FurnitureForm.Sofa;
import com.example.olx_application.ui.sell.FurnitureForm.other_HouseHold;

public class Furniture_SelMain extends AppCompatActivity {


    ListView listView;
    String furnituretitle[]={"Sofa & Dining","Beds & Wardrobes","Home Decor & Garden","Kids Furnitue","Other Household items"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture__sel_main);

        listView=findViewById(R.id.LISTVIEW_FURNITURE);

        FurnitureAdapter furnitureAdapter =new FurnitureAdapter (this,furnituretitle);
        listView.setAdapter(furnitureAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    /*Toast.makeText(Furniture_SelMain.this, "Sofa & Dining", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Furniture_SelMain.this, Sofa.class);
                    startActivity(intent);
                }
                if (position == 1){
                    /*Toast.makeText(Furniture_SelMain.this, "Beds & Wardrobes", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Furniture_SelMain.this, Beds.class);
                    startActivity(intent);
                }
                if(position == 2){
                    /*Toast.makeText(Furniture_SelMain.this, "Home Decor & Garden", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Furniture_SelMain.this, HomeDecore.class);
                    startActivity(intent);
                }
                if (position ==3){
                    /*Toast.makeText(Furniture_SelMain.this, "Kids Furnitue", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Furniture_SelMain.this, KidsFurniture.class);
                    startActivity(intent);
                }
                if (position ==4){
                    /*Toast.makeText(Furniture_SelMain.this, "Other Household items", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Furniture_SelMain.this, other_HouseHold.class);
                    startActivity(intent);
                }


            }
        });

    }

    class FurnitureAdapter extends ArrayAdapter<String> {

        Context context;
        String furnituretitle[];

        public FurnitureAdapter( Context context,String title[]) {
            super(context, R.layout.row_furituresell,R.id.TITLEFURNITURE,title);
            this.context=context;
            this.furnituretitle=title;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.row_furituresell,parent,false);
            TextView mytitle= row.findViewById(R.id.TITLEFURNITURE);

            mytitle.setText(furnituretitle[position]);




            return row;



        }
    }
}
