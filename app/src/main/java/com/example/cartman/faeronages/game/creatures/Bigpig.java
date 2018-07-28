package com.example.cartman.faeronages.game.creatures;



import android.util.Log;

import com.example.cartman.faeronages.game.data;
import com.example.cartman.faeronages.game.Character;

public class bigPig extends Boss {
    private boolean track=true;


    public boolean isOption1Used;
    public boolean isOption2Used;
    private int health;

    public bigPig(){

    }
    public String track(){
        if(track) {
            return "啊～，今天也是好天気☆～";
        }
        else {
            return "你注意到了一些不同寻常的痕迹，似乎有一只凶猛的生物曾经在附近游荡";
        }
    }
    public  String detailInfo(){
        return "经过你敏锐的调查，你发现这个庞然大物的脚印似乎有些深浅不一，它的腿部好像受伤了";
    }
    public  String specialEvent(){
        return "";
    }

    public void beSeeked(){
        Log.d("过了没？",13-Character.getDex()+"");
        boolean seekSecceed=data.d20(13-Character.getDex());
        Log.d("why?",seekSecceed+"");
        if(seekSecceed){
            Log.d("过了没!","过了！");
            track=false;
        }
    }
}
