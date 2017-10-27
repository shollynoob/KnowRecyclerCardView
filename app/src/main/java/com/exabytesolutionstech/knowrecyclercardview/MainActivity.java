package com.exabytesolutionstech.knowrecyclercardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<RecyclerItem> mContacts;
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutmanager;
    RecyclerView.Adapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContacts = new ArrayList<>();

        for (int i = 0; i <100 ; i++) {
            mContacts.add(new RecyclerItem("John "+i, "Doe "+i ));

        }

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
//        mRecyclerView.setHasFixedSize(true);

        mLayoutmanager = new LinearLayoutManager(this);
        mAdapter = new MainAdapter(mContacts);
        mRecyclerView.setLayoutManager(mLayoutmanager);
        mRecyclerView.setAdapter(mAdapter);

    }
}
