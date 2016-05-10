package com.jam.android.jamisonline.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.jam.android.jamisonline.R;

/**
 * Created by 99165 on 2016/5/10.
 */
public class TypeActivity extends AppCompatActivity {

    private RecyclerView typeRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tyoe);
        typeRecyclerView = (RecyclerView) findViewById(R.id.type_recyclerView);

    }


}
