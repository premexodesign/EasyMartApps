package com.example.olx_application.ui.explore.Fashion;

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
import com.example.olx_application.ui.explore.Books.books_main;

import java.util.ArrayList;
import java.util.List;

public class fashion_main extends AppCompatActivity {

    ListView listView_fashion;
    String fashionlist[] = {"Men", "Women", "Kids","View all"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion_main);

        listView_fashion=findViewById(R.id.LISTVIEW_FASHTION);

        setTitle("FASHION");

        FashionMainAdapter fashionMainAdapter = new FashionMainAdapter(this, fashionlist);
        listView_fashion.setAdapter(fashionMainAdapter);

        listView_fashion.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(fashion_main.this, "Men", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Toast.makeText(fashion_main.this, "Women", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Toast.makeText(fashion_main.this, "Kids", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Toast.makeText(fashion_main.this, "View all", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    class FashionMainAdapter extends ArrayAdapter<String> {

        Context context;
        String bookslist[];


        public FashionMainAdapter(@NonNull Context context, String list[]) {
            super(context, R.layout.list_mobilemain, R.id.LISTMOBILE_MAIN,list);
            this.context=context;
            this.bookslist=list;
        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(R.layout.list_mobilemain, parent, false);
            TextView mylist = view.findViewById(R.id.LISTMOBILE_MAIN);

            mylist.setText(bookslist[position]);

            return view;

        }



    }
}
