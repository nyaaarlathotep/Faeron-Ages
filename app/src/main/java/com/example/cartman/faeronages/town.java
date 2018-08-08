package com.example.cartman.faeronages;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

import com.example.cartman.faeronages.game.Adventure;
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
        town=new Town(Character.getLevel());

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Log.d("town thread","www");
                    Message message = new Message();
                    message.what = 1;
                    handler.sendMessage(message);
                    if(letsGo){
                        Adventure adventure=new Adventure(town.getPlace());
                        Character.setNextAdventure(adventure);
                        break;
                    }
                    try {
                        Thread.sleep(3000);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
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
        if(!town.isNeedChoose()) {
            option1.setText(town.getOption(1));
            option2.setText(town.getOption(2));
            option2.setText(town.getOption(3));
            overview.setText(town.getMove());
        }

    }
}
