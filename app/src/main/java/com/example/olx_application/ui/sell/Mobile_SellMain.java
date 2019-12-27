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
import com.example.olx_application.ui.sell.MobilePhoneForm.Accessories_Form;
import com.example.olx_application.ui.sell.MobilePhoneForm.MobilePhone_Form;
import com.example.olx_application.ui.sell.MobilePhoneForm.Tablet_Form;

public class Mobile_SellMain extends AppCompatActivity {

    ListView listView;
    String mobiletitle[]={"Mobile Phones","Accessories","Tablets"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile__sell_main);


        listView=findViewById(R.id.LISTVIEW_MOBILE);

        MobileAdapter mobileAdapter =new MobileAdapter(this,mobiletitle);
        listView.setAdapter(mobileAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    /*Toast.makeText(Mobile_SellMain.this, "Mobile Phones", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Mobile_SellMain.this, MobilePhone_Form.class);
                    startActivity(intent);
            }
                if (position == 1){
                    /*Toast.makeText(Mobile_SellMain.this, "Accessories", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Mobile_SellMain.this, Accessories_Form.class);
                    startActivity(intent);

                }
                if(position == 2){
                    /*Toast.makeText(Mobile_SellMain.this, "Tablets", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Mobile_SellMain.this, Tablet_Form.class);
                    startActivity(intent);

                }

            }
        });

    }

    class MobileAdapter extends ArrayAdapter<String> {

        Context context;
        String mobiletitle[];

        public MobileAdapter( Context context,String title[]) {
            super(context, R.layout.rowsell_mobile,R.id.MOBILETITLE,title);
            this.context=context;
            this.mobiletitle=title;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.rowsell_mobile,parent,false);
            TextView mytitle= row.findViewById(R.id.MOBILETITLE);

            mytitle.setText(mobiletitle[position]);

            return row;



        }
    }

}
