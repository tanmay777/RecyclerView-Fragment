package com.example.tanmayjha.recyclerviewapp;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tanmay jha on 31-07-2016.
 */
class ResailAdapter extends RecyclerView.Adapter<ResailAdapter.ViewHolder> {
    //provides a reference to the views in the recycler view
    String names[], rooms[], products[],phonenos[],costs[];

    public ResailAdapter( String[] names, String[] rooms, String[] products,String[] phonenos,String[] costs) {
        this.names = names;
        this.rooms = rooms;
        this.products = products;
        this.phonenos = phonenos;
        this.costs = costs;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //define the view holder
        private CardView cardView;
        public ViewHolder(CardView v)
        {
            super(v);
            cardView=v;
        }
    }

    @Override
    public ResailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //create a new view
        CardView cv=(CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_resaildata,parent,false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView=holder.cardView;
        TextView resailName=(TextView)cardView.findViewById(R.id.name_resail);
        resailName.setText(names[position]);
        TextView resailPhno=(TextView)cardView.findViewById(R.id.phoneno_resail);
        resailPhno.setText(phonenos[position]);
        TextView resailRoom=(TextView)cardView.findViewById(R.id.roomno_resail);
        resailRoom.setText(rooms[position]);
        TextView resailProduct=(TextView)cardView.findViewById(R.id.product_resail);
        resailProduct.setText(products[position]);
        TextView resailCost=(TextView)cardView.findViewById(R.id.cost_resail);
        resailCost.setText(costs[position]);
    }

    @Override
    public int getItemCount() {
        //Returns the no. of items in the dataset.
        return names.length;
    }
}
