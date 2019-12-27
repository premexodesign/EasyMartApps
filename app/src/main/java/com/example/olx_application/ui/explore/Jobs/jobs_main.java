package com.example.olx_application.ui.explore.Jobs;

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
import com.example.olx_application.ui.explore.Properties.property_main;

public class jobs_main extends AppCompatActivity {


    ListView listView_jobs;
    String joblist[] = {"Data entry & Back office", "Sales & Marketing", "BPO & Telecaller","Driver","Office Assistant",
            "Delivery & Collection", "Teacher", "Cook","Receptionist & Front Office","Operator & Tachnician","IT Engineer & Developer",
            "Hotel & Travel Executive","Accountant","Designer","Other Jobs","View All"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);

        listView_jobs=findViewById(R.id.LISTVIEW_JOBS);
        setTitle("JOBS");

       jobsMianAdapter jobsMianAdapter = new jobsMianAdapter(this, joblist);
        listView_jobs.setAdapter(jobsMianAdapter);


        listView_jobs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(jobs_main.this, "Data entry & Back office", Toast.LENGTH_SHORT).show();
                }

                if(position==1){
                    Toast.makeText(jobs_main.this, "Sales & Marketing", Toast.LENGTH_SHORT).show();
                }

                if(position==2){
                    Toast.makeText(jobs_main.this, "BPO & Telecaller", Toast.LENGTH_SHORT).show();
                }

                if(position==3){
                    Toast.makeText(jobs_main.this, "Driver", Toast.LENGTH_SHORT).show();
                }

                if(position==4){
                    Toast.makeText(jobs_main.this, "Office Assistant", Toast.LENGTH_SHORT).show();
                }

                if(position==5){
                    Toast.makeText(jobs_main.this, "Delivery & Collection", Toast.LENGTH_SHORT).show();
                }

                if(position==6){
                    Toast.makeText(jobs_main.this, "Teacher", Toast.LENGTH_SHORT).show();
                }

                if(position==7){
                    Toast.makeText(jobs_main.this, "Cook", Toast.LENGTH_SHORT).show();
                }

                if(position==8){
                    Toast.makeText(jobs_main.this, "Receptionist & Front Office", Toast.LENGTH_SHORT).show();
                }

                if(position==9){
                    Toast.makeText(jobs_main.this, "Operator & Tachnician", Toast.LENGTH_SHORT).show();
                }

                if(position==10){
                    Toast.makeText(jobs_main.this, "IT Engineer & Developer", Toast.LENGTH_SHORT).show();
                }

                if(position==11){
                    Toast.makeText(jobs_main.this, "Hotel & Travel Executive", Toast.LENGTH_SHORT).show();
                }

                if(position==12){
                    Toast.makeText(jobs_main.this, "Accountantr", Toast.LENGTH_SHORT).show();
                }

                if(position==13){
                    Toast.makeText(jobs_main.this, "Designer", Toast.LENGTH_SHORT).show();
                }

                if(position==14){
                    Toast.makeText(jobs_main.this, "Other Jobs", Toast.LENGTH_SHORT).show();
                }

                if(position==15){
                    Toast.makeText(jobs_main.this, "View All", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

class jobsMianAdapter extends ArrayAdapter<String>{

        Context context;
        String joblist[];


    public jobsMianAdapter(@NonNull Context context, String list[] ) {
        super(context, R.layout.list_jobsmain, R.id.LISTJOBS_MAIN,list);
        this.context=context;
        this.joblist=list;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.list_jobsmain, parent, false);
        TextView mylist = view.findViewById(R.id.LISTJOBS_MAIN);

        mylist.setText(joblist[position]);

        return view;

    }
}
}
