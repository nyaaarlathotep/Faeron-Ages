package com.example.cartman.faeronages;

import android.os.Bundle;
import android.util.Log;

public class eventlogAndClock extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventlog_and_clock);

        Log.d("rrrrrace",Character.getRace());
        Log.d("nnnnname",Character.getName());
        Log.d("ffffaith",Character.getFaith());


    }
}
