package com.volly.www.vollyhelper.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.volly.www.vollyhelper.R;
import com.volly.www.vollyhelper.model.Detail;

import java.util.List;

/**
 * Created by Abhisek on 07-12-2017.
 */

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.MyViewHolder> {

    List<Detail> founderList;

    public DetailsAdapter(List<Detail> founderList) {
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
    public DetailsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_details, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DetailsAdapter.MyViewHolder holder, int position) {

        holder.mName.setText(founderList.get(position).getName());
        holder.mEmailid.setText(founderList.get(position).getEmail());
        holder.mPhone.setText(founderList.get(position).getPhone().getMobile());

    }

    @Override
    public int getItemCount() {
        return founderList.size();
    }
}
