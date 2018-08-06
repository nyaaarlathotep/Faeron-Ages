package com.example.cartman.faeronages;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import java.lang.ref.WeakReference;

public class town extends BaseActivity {

    MHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_town);

        handler=new MHandler(this);


        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }

    static class MHandler extends Handler {
        WeakReference<town> town;

        MHandler(town activity) {
            town = new WeakReference<>(activity);
        }

        @Override
        public void handleMessage(android.os.Message msg) {
            super.handleMessage(msg);
            town theClass = town.get();
            switch (msg.what){
                case 1:{

                }
                default:{
                    Log.w("error", "未知的Handler Message:" + msg.what);
                }
            }
        }
    }
}
