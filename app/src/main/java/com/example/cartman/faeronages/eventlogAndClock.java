package com.example.cartman.faeronages;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

import com.example.cartman.faeronages.game.Adventure;
import com.example.cartman.faeronages.game.Character;

import java.lang.ref.WeakReference;

public class eventlogAndClock extends BaseActivity {

    TextView textView;
    TextView log1;
    TextView log2;
    TextView log3;
    MHandler handler;
    Adventure adventure;
    private boolean ifStop=true;
    private int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Log.d("rrrrrace", Character.getRace().toString());
        Log.d("nnnnname",Character.getName());
        Log.d("ffffaith",Character.getFaith().toString());
        Log.d("jjjjob",Character.getJob().toString());

        adventure=new Adventure(Character.getMonsters());


        setContentView(R.layout.activity_eventlog_and_clock);
        textView=(TextView)findViewById(R.id.timer) ;
        log1=(TextView)findViewById(R.id.log1) ;
        log2=(TextView)findViewById(R.id.log2) ;
        log3=(TextView)findViewById(R.id.log3);

        handler=new MHandler(this);
        Message message=new Message();
        handler.handleMessage(message);

        new Thread(new Runnable() {
            @Override
            public void run() {
                count=0;
                while(ifStop){
                    count++;
                    Message msg=new Message();
                    msg.arg1=count;
                    handler.sendMessage(msg);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }


    static class MHandler extends Handler {
        WeakReference<eventlogAndClock> eventlogAndClock;

        MHandler(eventlogAndClock activity) {
            eventlogAndClock = new WeakReference<eventlogAndClock>(activity);
        }

        @Override
        public void handleMessage(android.os.Message msg) {
            super.handleMessage(msg);
            eventlogAndClock theClass = eventlogAndClock.get();
            switch (msg.what) {
                case 0: {
                    //使用theClass访问外部类成员和方法9
                    theClass.textView.setText(String.valueOf(msg.arg1));
                    theClass.log1.setText(theClass.adventure.smallFight());

                    break;
                }
                default: {
                    Log.w("error", "未知的Handler Message:" + msg.what);
                }
            }
        }

    }
}
