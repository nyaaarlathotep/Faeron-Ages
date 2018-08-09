package com.example.cartman.faeronages;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cartman.faeronages.game.Character;
import com.example.cartman.faeronages.game.Town;

import java.lang.ref.WeakReference;

public class town extends BaseActivity {

    MHandler handler;
    TextView theTownEvent;
    TextView overview;
    TextView option1;
    TextView option2;
    TextView option3;

    Button A;
    Button B;
    Button C;

    boolean buttonAble=false;
    boolean needToGetTownEvent=true;
    boolean letsGo=false;
    Town town;

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
        A=findViewById(R.id.A);
        B=findViewById(R.id.B);
        C=findViewById(R.id.C);
        town=new Town(Character.getLevel());

        A.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(buttonAble){
                    town.choose(0);
                    buttonAble=false;
                    setFree();
                    Log.d("town","a");
                }
            }
        });
        B.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(buttonAble){
                    town.choose(1);
                    buttonAble=false;
                    setFree();
                    Log.d("town","b");

                }
            }
        });
        C.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(buttonAble){
                    town.choose(2);
                    buttonAble=false;
                    setFree();
                    Log.d("town","c");

                }
            }
        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Log.d("town thread","www");
                    Message message = new Message();
                    message.what = 1;
                    handler.sendMessage(message);
                    if(letsGo){
                        break;
                    }
                    try {
                        Thread.sleep(3000);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                Intent intent=new Intent(town.this,eventlogAndClock.class);
                startActivity(intent);
                finish();
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
                    break;
                }
                default:{
                    Log.w("error", "town未知的Handler Message:" + msg.what);
                }
            }
        }
    }
    private void updateUI(){
        if(needToGetTownEvent){
            theTownEvent.setText(town.getTownEvent());
            needToGetTownEvent=false;
        }
        if(!buttonAble) {

            option1.setText(town.getOption(0));
            option2.setText(town.getOption(1));
            option3.setText(town.getOption(2));
            overview.setText(town.getMove());
            buttonAble=town.isNeedChoose();
        }
    }

    public void setFree() {
        letsGo=town.getFree();
    }
}
