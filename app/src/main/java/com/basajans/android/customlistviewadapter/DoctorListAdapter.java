package com.basajans.android.customlistviewadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by HP on 02/02/2017.
 */

public class DoctorListAdapter extends BaseAdapter {
    private Context mContext;
    private List<Doctor> mDoctorList;

    // Constructor
    public DoctorListAdapter(Context mContext, List<Doctor> mDoctorList) {
        this.mContext = mContext;
        this.mDoctorList = mDoctorList;
    }

    @Override
    public int getCount() {
        return mDoctorList.size();
    }

    @Override
    public Object getItem(int position) {
        return mDoctorList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Layout view for List of Doctor
        View newDview = View.inflate(mContext, R.layout.doctor_list, null);

        // getView for Doctor List
        ImageView imgDview = (ImageView)newDview.findViewById(R.id.iv_doc_pic);
        TextView tvDrname = (TextView)newDview.findViewById(R.id.tv_drname);
        TextView tvDrspecialty = (TextView)newDview.findViewById(R.id.tv_specialty);

        // Set text and image for View of Doctor
        imgDview.setImageResource(mDoctorList.get(position).getDoc_pic_id());
        tvDrname.setText(mDoctorList.get(position).getNameDoc());
        tvDrspecialty.setText(mDoctorList.get(position).getSpecialty());

        // Save hospital id to tag
        newDview.setTag(mDoctorList.get(position).getDoc_id());

        return newDview;
    }
}
