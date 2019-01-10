package com.example.android.jsonapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Jsondata> data1;

    public MenuAdapter(Context mcontext, ArrayList<Jsondata> mjsondata){
        this.context = mcontext;
        this.data1 = mjsondata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.menucard,viewGroup,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Picasso.get().load(data1.get(i).getImageurl()).resize(100, 100).centerCrop().into(viewHolder.menuimage);
        viewHolder.destinationtext.setText(data1.get(i).getTitle());
        viewHolder.listingstext.setText(data1.get(i).getListings());
        viewHolder.amounttext.setText(data1.get(i).getAmount());

    }

    @Override
    public int getItemCount() {
        return data1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView menuimage;
        TextView destinationtext;
        TextView listingstext;
        TextView amounttext;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            menuimage = (ImageView) itemView.findViewById(R.id.menuimage);
            destinationtext = (TextView) itemView.findViewById(R.id.menutitletext);
            listingstext = (TextView) itemView.findViewById(R.id.menulistingstext);
            amounttext = (TextView) itemView.findViewById(R.id.menuamounttext);

        }
    }
}
