package com.example.parking;

import android.os.Bundle;

import androidx.annotation.Nullable;

public class SlidebarActivity extends AddCarsActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slidebar_layout);
    }
}
