package com.example.cartman.faeronages;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.cartman.faeronages.game.Adventure;
import com.example.cartman.faeronages.game.Character;
import com.example.cartman.faeronages.game.data;

import java.lang.ref.WeakReference;

public class eventlogAndClock extends BaseActivity {

    TextView time;
    TextView log1;
    TextView log2;
    TextView log3;
    Button A;
    Button B;
    MHandler handler;
    Adventure adventure;
    String timeUsed;
    static boolean needStop=false;

//    counted in second
    int adventureTime;
    int timeUsedInSec=0;

    private boolean ifStop=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventlog_and_clock);

//        test character
        Log.d("rrrrrace", Character.getRace().toString());
        Log.d("nnnnname",Character.getName());
        Log.d("ffffaith",Character.getFaith().toString());
        Log.d("jjjjob",Character.getJob().toString());

        adventure=Character.getAdventure();
        adventureTime=adventure.getTime();
        time=(TextView)findViewById(R.id.timer) ;
        log1=(TextView)findViewById(R.id.log1) ;
        log2=(TextView)findViewById(R.id.log2) ;
        log3=(TextView) findViewById(R.id.log3);
        A=(Button)findViewById(R.id.iChooseA);
        B=(Button)findViewById(R.id.iChooseB);

        handler=new MHandler(this);
        Message message=new Message();
        handler.handleMessage(message);


        new Thread(new Runnable() {
            @Override
            public void run() {
                while(ifStop){
                    Message msg=new Message();
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
            eventlogAndClock = new WeakReference<>(activity);
        }

        @Override
        public void handleMessage(android.os.Message msg) {
            super.handleMessage(msg);
            eventlogAndClock theClass = eventlogAndClock.get();
            switch (msg.what) {
                case 0: {
                    //使用theClass访问外部类成员和方法
                    if(!needStop) {
                        theClass.updateUI();  //更新UI
                    }
                    theClass.addTimeUsed();    //计时
                    break;
                }
                default: {
                    Log.w("error", "未知的Handler Message:" + msg.what);
                }
            }
        }

    }


    private void updateUI() {
        time.setText(timeUsed);
        if(timeUsedInSec%10==0){
            log1.setText(adventure.smallFight());
            log2.setText(adventure.environment());
            log3.setText("我tm锤爆");
        }else if(timeUsedInSec%15==0){
            String hangOut=adventure.hangOut();
            log3.setText("战斗结束");
            log1.setText(adventure.hangOut());
            if(hangOut.split("]")[0].equals("[警戒")){
                adventure.investigate();
            }
        }else if(timeUsedInSec%5==0){
            log3.setText("战斗结束");
            log1.setText(Character.showBag());
        }
        if(adventureTime==timeUsedInSec){
            log2.setText(data.home);
            ifStop=false;
        }
    }

    public void addTimeUsed() {
        timeUsed = getMin() + ":" + getSec();
        timeUsedInSec = timeUsedInSec + 1;
    }

    public CharSequence getMin() {
        return String.valueOf((adventureTime-timeUsedInSec)/ 60);
    }

    public CharSequence getSec() {
        return String.valueOf((adventureTime-timeUsedInSec)% 60);
    }

}
