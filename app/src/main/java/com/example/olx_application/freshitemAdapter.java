package com.example.olx_application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

 public class freshitemAdapter extends RecyclerView.Adapter<freshitemAdapter.MyViewHolder> {

    Context context;
    private List<freshitemModel> freshitemModels;

    public freshitemAdapter(Context context, List<freshitemModel> freshitemModels) {
        this.context = context;
        this.freshitemModels = freshitemModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater=LayoutInflater.from(context);
        view=inflater.inflate(R.layout.item_fresh,parent,false);
        return new freshitemAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvtitle.setText(freshitemModels.get(position).getTitle());
        holder.tvPrice.setText(""+freshitemModels.get(position).getPrice());
        holder.imgfresh.setImageResource(freshitemModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return freshitemModels.size();
    }

    public  class  MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvtitle;
        TextView tvPrice;
        ImageView imgfresh;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            tvtitle=(TextView)itemView.findViewById(R.id.FRESHTITLE);
            tvPrice=(TextView)itemView.findViewById(R.id.FRESHPRICE);
            imgfresh=(ImageView)itemView.findViewById(R.id.IMGGRIDFRESH);
        }
    }
}
