package com.example.cartman.faeronages;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
    boolean buttonAble=false;

//    counted in second
    int adventureTime;
    int timeUsedInSec=0;

    private boolean ifStop=true;
    private boolean free=false;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.eventlog_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option_normal_1:{
                Log.d("1","1");
                Intent intent=new Intent(eventlogAndClock.this,character.class);
                startActivity(intent);
                break;
            }
            case R.id.option_normal_2:{
                Log.d("2","2");
                Intent intent=new Intent(eventlogAndClock.this,equipment.class);
                startActivity(intent);
                break;
            }
            case R.id.option_normal_3:{
                Log.d("3","3");

                Intent intent=new Intent(eventlogAndClock.this,bag.class);
                startActivity(intent);
                break;
            }
            case R.id.option_normal_4:{
                Log.d("4","4");
                Intent intent=new Intent(eventlogAndClock.this,spell.class);
                startActivity(intent);
                break;
            }
            default:
        }
        return true;
    }

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
        time=findViewById(R.id.timer) ;
        log1=findViewById(R.id.log1) ;
        log2=findViewById(R.id.log2) ;
        log3= findViewById(R.id.log3);
        A=findViewById(R.id.iChooseA);
        B=findViewById(R.id.iChooseB);

        handler=new MHandler(this);
        Message message=new Message();
        handler.handleMessage(message);


        A.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(buttonAble){
                    if(!adventure.knowBoss()){
                        free=true;
                    }else {
                        Log.d("aaa","aaa");
                        String ss=adventure.iChooseA();
                        buttonAble=false;
                        if(ss.equals("end")){
                            free=true;
                        }
                    }
                }
            }
        });
        B.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(buttonAble){
                    if(!adventure.knowBoss()){
                        free=true;
                    }else{
                        Log.d("bbb","b");
                        String ss=adventure.iChooseB();
                        buttonAble=false;
                        if(ss.equals("end")){
                            free=true;
                        }
                    }

                }
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {

                while(ifStop){
                    Message msg=new Message();
                    msg.what=0;
                    handler.sendMessage(msg);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                while (!ifStop){
                    Message msg=new Message();
                    msg.what=1;
                    handler.sendMessage(msg);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(free){
                        break;
                    }
                }
                Log.d("!!","intent ready");
                Intent intent=new Intent(eventlogAndClock.this,town.class);
                startActivity(intent);
                finish();
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
                            if (!needStop) {
                                theClass.updateUI();  //更新UI
                                theClass.addTimeUsed();    //计时
                            }
                            break;
                    }
                case 1:{
                    if(!theClass.buttonAble) {
                        theClass.bossFight();
                    }
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
            time.setText("骰子!");
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

    private void bossFight(){
        if(!adventure.knowBoss()){
            log1.setText("是时候回到镇子处理怪物素材，更新升级装备了");
            buttonAble=true;
            log2.setText("A:回去");
            log3.setText("B:回去");
        }else {
            buttonAble=true;
            log1.setText(adventure.battleInfo());
            log2.setText(adventure.battleChoiceContent(true));
            log3.setText(adventure.battleChoiceContent(false));
            if(!data.d20haveShown) {
                time.setText(data.showLastD20());
                data.d20haveShown=true;
            }
        }
    }
}
