package com.basajans.android.customlistviewadapter;

import android.app.Activity;
import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by HP on 02/02/2017.
 */

public class DoctorActivity extends Activity{


    private ListView lvDoctor;
    private DoctorListAdapter dAdapter;
    private List<Doctor> mDoctorList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        // Doctor Screen Logic (created by Ucu on 02022017)
        // Hospital Screen Logic (created by Ucu on 24012017)
        setContentView(R.layout.activity_doctor_view);
        lvDoctor = (ListView)findViewById(R.id.listview_doctor);
        mDoctorList = new ArrayList<>();
        // Add sample data
        // We can get data by DB, or web service
        mDoctorList.add(new Doctor(1, R.drawable.dr_ilma_suraya , "dr. Ilma Suraya", "Dokter Umum"));
        mDoctorList.add(new Doctor(2, R.drawable.dr_indah_kusuma , "dr. Indah Kusuma", "Dokter Umum"));
        mDoctorList.add(new Doctor(3, R.drawable.dr_menda_suci, "dr. Suci Menda", "Dokter Umum"));
        mDoctorList.add(new Doctor(4, R.drawable.dr_tengku_nissa , "dr. Tengku Nissa", "Dokter Umum"));
        mDoctorList.add(new Doctor(5, R.drawable.dr_winda_meyrisa, "dr. Winda Meyrisa", "Dokter Umum"));

        // Test adapter
        dAdapter = new DoctorListAdapter(getApplicationContext(), mDoctorList);
        lvDoctor.setAdapter(dAdapter);

        lvDoctor.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Do something
                // Ex. display msg with hospital id from view.getTag
                Toast.makeText(getApplicationContext(), "Clicked doctor id = " + view.getTag(), Toast.LENGTH_SHORT).show();
            }

        });

//        ImageView ivDoc_pic = (ImageView) findViewById(R.id.iv_doc_pic);
//        ivDoc_pic.setImageResource(R.drawable.dr_indah_kusuma);
//
//        TextView tvDrname = (TextView) findViewById(R.id.tv_drname);
//        tvDrname.setText("dr. Indah Kusuma");
//
//        TextView tvSpecialty = (TextView) findViewById(R.id.tv_specialty);
//        tvDrname.setText("Dokter Umum");

    }
}
