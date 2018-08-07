package com.example.cartman.faeronages;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class town extends BaseActivity {

    MHandler handler;
    TextView theTownEvent;
    TextView overview;
    TextView option1;
    TextView option2;
    TextView option3;
    boolean buttonAble=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_town);

        handler=new MHandler(this);
        theTownEvent=findViewById(R.id.theTownEvent);
        overview=findViewById(R.id.overview);
        option1=findViewById(R.id.option1);
        option2=findViewById(R.id.option2);
        option3=findViewById(R.id.option3);

        new Thread(new Runnable() {
            @Override
            public void run() {
                Message message=new Message();
                message.what=1;
                handler.sendMessage(message);
                try{
                    Thread.sleep(5000);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
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
                    theClass.updateUI();
                }
                default:{
                    Log.w("error", "未知的Handler Message:" + msg.what);
                }
            }
        }
    }
    private void updateUI(){
        
    }
}
