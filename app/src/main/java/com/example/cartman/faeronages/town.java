package com.example.cartman.faeronages;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cartman.faeronages.game.Character;
import com.example.cartman.faeronages.game.Town;

import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.reflect.Modifier.PRIVATE;

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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.town_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option_normal_1:{
                Intent intent=new Intent(town.this,missionList.class);
                startActivity(intent);
                break;
            }
            case R.id.option_normal_2:{
                Intent intent=new Intent(town.this,campInfo.class);
                startActivity(intent);
                break;
            }
            case R.id.option_normal_3:{
                Intent intent=new Intent(town.this,fame.class);
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


        Character.checkMission();
        Character.sellBag();
        Character.experience();
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
                save();
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
    private void save(){

        Set<String> spells = new HashSet<>(Arrays.asList(Character.getSpells()));
        Set<String> mission = new HashSet<>(Character.getMission());
        Set<String> livingBag = new HashSet<>(Character.getLivingBag());
        Set<String> specialBag = new HashSet<>(Arrays.asList(Character.getSpecialBag()));
        float gold=Float.valueOf(String.valueOf(Character.getGold()));
        String map=Character.getAdventure().getMap().toString();
        int[] strengthenLevel=Character.getStrengthLevel();

        SharedPreferences.Editor editor=getSharedPreferences("data",MODE_PRIVATE).edit();
        editor.putString("name",Character.getName());
        editor.putString("job",Character.getJob().toString());
        editor.putString("faith",Character.getFaith().toString());
        editor.putString("race",Character.getRace().toString());
        editor.putInt("camp0",Character.getCamp()[0]);
        editor.putInt("camp1",Character.getCamp()[1]);
        editor.putInt("age",Character.getAge());
        editor.putInt("level",Character.getLevel());
        editor.putString("helmet",Character.getHelmet());
        editor.putString("breastPlate",Character.getBreastPlate());
        editor.putString("leftHand",Character.getLeftHand());
        editor.putString("rightHand",Character.getRightHand());
        editor.putString("legArmor",Character.getLegArmor());
        editor.putString("rings",Character.getRings());
        editor.putString("neckLace",Character.getNeckLace());
        editor.putInt("str",Character.getStr());
        editor.putInt("con",Character.getCon());
        editor.putInt("intll",Character.getIntell());
        editor.putInt("dex",Character.getDex());
        editor.putInt("cha",Character.getCha());
        editor.putStringSet("spells",spells);
        editor.putStringSet("mission",mission);
        editor.putStringSet("livingBag",livingBag);
        editor.putFloat("gold",gold);
        editor.putStringSet("specialBag",specialBag);
        editor.putString("adventure",map);
        editor.putInt("strengthenLevel0",strengthenLevel[0]);
        editor.putInt("strengthenLevel1",strengthenLevel[1]);
        editor.putInt("strengthenLevel2",strengthenLevel[2]);
        editor.putInt("strengthenLevel3",strengthenLevel[3]);
        editor.putInt("strengthenLevel4",strengthenLevel[4]);
        editor.putInt("strengthenLevel5",strengthenLevel[5]);
        editor.putInt("strengthenLevel6",strengthenLevel[6]);
        editor.apply();
        Character.setHasSaved();
        Log.d("save","save!!!");

    }
    public void setFree() {
        letsGo=town.getFree();
    }
}
