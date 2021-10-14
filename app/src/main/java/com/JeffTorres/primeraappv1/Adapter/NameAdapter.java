package com.JeffTorres.primeraappv1.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.JeffTorres.primeraappv1.R;

import java.util.List;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameViewHolder>
{
    private List<String> data;

    public NameAdapter(List<String> data)
    {
        this.data = data;
    }

    public NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_name,parent ,false);
        return new NameViewHolder(view);
    }

    public void onBindViewHolder( NameViewHolder holder, int position)
    {
//        TextView tv = holder.itemView.findViewById(R.id.tvName);
//        TextView tnum = holder.itemView.findViewById(R.id.tnumero);

//        String value = data.get(position);
//        tv.setText(value);
//
//        String valnu = data.get(position);
//        tnum.setText(valnu);
    }

    public int getItemCount()
    {
        return data.size();
    }

    class NameViewHolder extends  RecyclerView.ViewHolder
    {

        public NameViewHolder(View itemView)
        {
            super(itemView);
        }
    }
}
