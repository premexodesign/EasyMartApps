package com.example.olx_application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class sparepartsAdapter extends RecyclerView.Adapter<sparepartsAdapter.ViewHolder> {

Context context;
private List<sparepartsModel> sparepartsModels;

    public sparepartsAdapter(Context context, List<sparepartsModel> sparepartsModels) {
        this.context = context;
        this.sparepartsModels = sparepartsModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater=LayoutInflater.from(context);
        view=inflater.inflate(R.layout.item_spareparts,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvnamespareparts.setText(sparepartsModels.get(position).getName());
        holder.imagespareparts.setImageResource(sparepartsModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return sparepartsModels.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder
    {
        TextView tvnamespareparts;
        ImageView imagespareparts;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            tvnamespareparts=(TextView)itemView.findViewById(R.id.TXTSPAREPARTSTITLE);
            imagespareparts=(ImageView)itemView.findViewById(R.id.IMGSPAREPARTS);
            cardView=(CardView)itemView.findViewById(R.id.CARDVIEW_SPAREARTS);
        }
    }
}
