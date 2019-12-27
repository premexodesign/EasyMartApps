package com.example.olx_application.ui.explore.Mobiles;

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
import com.example.olx_application.ui.explore.Properties.property_main;

import java.util.ArrayList;
import java.util.List;

public class mobile_main extends AppCompatActivity {


    ListView listView_mobile;
    String mobilelist[] = {"Mobile Phones", "Accessories", "Tablets","View all"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_main);


        listView_mobile=findViewById(R.id.LISTVIEW_MOBILE);

        setTitle("PROPERTIES");

        MobileMainAdapter mobileMainAdapter = new MobileMainAdapter(this, mobilelist);
        listView_mobile.setAdapter(mobileMainAdapter);

        listView_mobile.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(mobile_main.this, "Mobile Phones", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Toast.makeText(mobile_main.this, "Accessories", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Toast.makeText(mobile_main.this, "Tablets", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Toast.makeText(mobile_main.this, "View all", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    class MobileMainAdapter extends ArrayAdapter<String> {

        Context context;
        String mobilelist[];


        public MobileMainAdapter(@NonNull Context context, String list[]) {
            super(context, R.layout.list_mobilemain, R.id.LISTMOBILE_MAIN,list);
            this.context=context;
            this.mobilelist=list;
        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(R.layout.list_mobilemain, parent, false);
            TextView mylist = view.findViewById(R.id.LISTMOBILE_MAIN);

            mylist.setText(mobilelist[position]);

            return view;

        }

    }
}
