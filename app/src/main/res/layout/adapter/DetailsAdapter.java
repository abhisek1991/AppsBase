package com.example.abhisek.vollyjsonarray.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abhisek.vollyjsonarray.R;

import java.util.List;

/**
 * Created by Abhisek on 07-12-2017.
 */

public class DetailsAdapter extends RecyclerView.Adapter<com.example.abhisek.vollyjsonarray.adapter.DetailsAdapter.MyViewHolder> {

    List<com.example.abhisek.vollyjsonarray.model.Detail> founderList;

    public DetailsAdapter(List<com.example.abhisek.vollyjsonarray.model.Detail> founderList) {
        this.founderList = founderList;
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mName, mEmailid, mPhone;

        public MyViewHolder(View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.text_name_id);
            mEmailid = itemView.findViewById(R.id.text_email_id);
            mPhone = itemView.findViewById(R.id.text_phone_id);
        }

    }
    @Override
    public com.example.abhisek.vollyjsonarray.adapter.DetailsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_details, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(com.example.abhisek.vollyjsonarray.adapter.DetailsAdapter.MyViewHolder holder, int position) {

        holder.mName.setText(founderList.get(position).getName());
        holder.mEmailid.setText(founderList.get(position).getEmail());
        holder.mPhone.setText(founderList.get(position).getPhone().getMobile());

    }

    @Override
    public int getItemCount() {
        return founderList.size();
    }
}
