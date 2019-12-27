package com.example.olx_application.ui.sell;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;
import com.example.olx_application.ui.sell.BooksForm.Books;
import com.example.olx_application.ui.sell.BooksForm.Gym_Fitness;
import com.example.olx_application.ui.sell.BooksForm.Musical_Instruments;
import com.example.olx_application.ui.sell.BooksForm.Sports_Equipment;
import com.example.olx_application.ui.sell.BooksForm.other_hobies;

public class Books_SellMain extends AppCompatActivity {


    ListView listView;
    String booktitle[]={"Books","Gym & Fitness","Musical Instruments","Sports Equipment","Other Hobbies"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books__sell_main);

        listView=findViewById(R.id.LISTVIEW_BOOKS);

       BookAdapter bookAdapter =new BookAdapter(this,booktitle);
        listView.setAdapter(bookAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                   /* Toast.makeText(Books_SellMain.this, "Books", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Books_SellMain.this, Books.class);
                    startActivity(intent);
                }
                if (position == 1){
                   /* Toast.makeText(Books_SellMain.this, "Gym & Fitness", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Books_SellMain.this, Gym_Fitness.class);
                    startActivity(intent);
                }
                if(position == 2){
                   /* Toast.makeText(Books_SellMain.this, "Musical Instruments", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Books_SellMain.this, Musical_Instruments.class);
                    startActivity(intent);
                }
                if (position ==3){
                   /* Toast.makeText(Books_SellMain.this, "Sports Equipment", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Books_SellMain.this, Sports_Equipment  .class);
                    startActivity(intent);
                }
                if (position ==4){
                    /*Toast.makeText(Books_SellMain.this, "Other Hobbies", Toast.LENGTH_SHORT).show();*/
                    Intent intent=new Intent(Books_SellMain.this, other_hobies.class);
                    startActivity(intent);
                }


            }
        });

    }

    class BookAdapter extends ArrayAdapter<String> {

        Context context;
        String booktitle[];

        public BookAdapter( Context context,String title[]) {
            super(context, R.layout.row_furituresell,R.id.TITLEBOOKS,title);
            this.context=context;
            this.booktitle=title;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.row_booksell,parent,false);
            TextView mytitle= row.findViewById(R.id.TITLEBOOKS);

            mytitle.setText(booktitle[position]);


            return row;

        }
    }

    public static class Bike_Spareparts_Form extends AppCompatActivity {

        EditText bikesp_adtitleetx,bikesp_desetx;
        Button bikesp_btnnext;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bike__sparepart_form);

            bikesp_adtitleetx=findViewById(R.id.ADTITLEETX_BIKESP);
            bikesp_desetx=findViewById(R.id.DESCRIPTIONETX_BIKESP);
            bikesp_btnnext=findViewById(R.id.BUTTONNEXT_BIKESP);
        }
    }
}
