package com.basajans.android.customlistviewadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HP on 26/01/2017.
 */

public class HospitalListAdapter extends BaseAdapter {
    private Context mContext;
    private List<Hospital> mHospitalList;
    // Constructor

    public HospitalListAdapter(Context mContext, List<Hospital> mHospitalList) {
        this.mContext = mContext;
        this.mHospitalList = mHospitalList;
    }

    @Override
    public int getCount() {
        return mHospitalList.size();
    }

    @Override
    public Object getItem(int position) {
        return mHospitalList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Layout view for List of Hospital
        View newView = View.inflate(mContext, R.layout.hospital_list, null);

        // getView for Hospital List
        ImageView imgView = (ImageView)newView.findViewById(R.id.iv_hospital_pic);
        TextView tvName = (TextView)newView.findViewById(R.id.tv_name);
        TextView tvAddress = (TextView)newView.findViewById(R.id.tv_address);

        // Set text and image for View of Hospital
        imgView.setImageResource(mHospitalList.get(position).getHospital_pic_id());
        tvName.setText(mHospitalList.get(position).getName());
        tvAddress.setText(mHospitalList.get(position).getAddress());

        // Save hospital id to tag
        newView.setTag(mHospitalList.get(position).getId());

        return newView;
    }
}

