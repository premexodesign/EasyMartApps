package com.example.olx_application.ui.explore.Books;

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

import com.example.olx_application.R;
import com.example.olx_application.ui.explore.Bikes.bike_main;

public class books_main extends AppCompatActivity {

    ListView listView_books;
    String bookslist[] = {"Books", "Gym & Fitness", "Musical instruments","Sports Equipment","Other Hobbies","View all"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_main);

        listView_books=findViewById(R.id.LISTVIEW_BOOKS);

        setTitle("BOOKS,SPORTS & HOBBIES");

        BooksMainAdapter booksMainAdapter = new BooksMainAdapter(this, bookslist);
        listView_books.setAdapter(booksMainAdapter);

        listView_books.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(books_main.this, "Books", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Toast.makeText(books_main.this, "Gym & Fitness", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Toast.makeText(books_main.this, "Musical instruments", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Toast.makeText(books_main.this, "Sports Equipment", Toast.LENGTH_SHORT).show();
                }

                if (position==4){
                    Toast.makeText(books_main.this, "Other Hobbies", Toast.LENGTH_SHORT).show();
                }

                if (position == 5) {
                    Toast.makeText(books_main.this, "View all", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    class BooksMainAdapter extends ArrayAdapter<String> {

        Context context;
        String bookslist[];


        public BooksMainAdapter(@NonNull Context context, String list[]) {
            super(context, R.layout.list_booksmain, R.id.LISTBOOKS_MAIN,list);
            this.context=context;
            this.bookslist=list;
        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(R.layout.list_booksmain, parent, false);
            TextView mylist = view.findViewById(R.id.LISTBOOKS_MAIN);

            mylist.setText(bookslist[position]);

            return view;

        }

    }
}
