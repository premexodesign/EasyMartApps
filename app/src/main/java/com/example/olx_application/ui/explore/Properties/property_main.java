package com.example.olx_application.ui.explore.Properties;

import android.content.Context;
import android.content.Intent;
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

import java.util.ArrayList;
import java.util.List;

public class property_main extends AppCompatActivity {


    ListView listView_property;
    String propertylist[] = {"For sale: Houses & Apartments", "For Rent: Houses & Apartments", "Lands & Plots",
            "For Rent: Shops & Offices", "For Sale: Shops & Offices ", "PG & Guest Houses","View All"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_main);

        listView_property=findViewById(R.id.LISTVIEW_PROPERTY_MAIN);

        setTitle("PROPERTIES");

        PropertyMainAdapter propertyMainAdapter = new PropertyMainAdapter(this, propertylist);
        listView_property.setAdapter(propertyMainAdapter);

        listView_property.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intentforsale=new Intent(property_main.this,Property_FORSALE.class);
                    startActivity(intentforsale);
                }
                if (position == 1) {
                    Toast.makeText(property_main.this, "For Rent: Houses & Apartments", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Toast.makeText(property_main.this, "Lands & Plots", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Toast.makeText(property_main.this, "For Rent: Shops & Offices", Toast.LENGTH_SHORT).show();
                }
                if (position == 4) {
                    Toast.makeText(property_main.this, "For Sale: Shops & Offices", Toast.LENGTH_SHORT).show();
                }
                if (position == 5) {
                    Toast.makeText(property_main.this, "PG & Guest Houses", Toast.LENGTH_SHORT).show();
                }

                if (position==6){
                    Toast.makeText(property_main.this, "View All", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

class PropertyMainAdapter extends ArrayAdapter<String>{

        Context context;
        String propertylist[];


    public PropertyMainAdapter(@NonNull Context context,String list[]) {
        super(context, R.layout.list_properymain, R.id.LISTPROPERTY_MAIN,list);
        this.context=context;
       this.propertylist=list;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.list_properymain, parent, false);
        TextView mylist = view.findViewById(R.id.LISTPROPERTY_MAIN);

        mylist.setText(propertylist[position]);

        return view;

    }
}

}
