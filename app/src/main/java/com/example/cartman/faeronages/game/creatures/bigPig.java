package com.example.cartman.faeronages.game.creatures;



import com.example.cartman.faeronages.game.data;
import com.example.cartman.faeronages.game.Character;

public class bigPig extends Boss {
    public boolean track1=false;
    public boolean track2=false;
    public String trance="啊～，今天也是好天気☆～";

    public boolean isOption1Used;
    public boolean isOption2Used;
    private int health;

    public bigPig(){

    }
    public String track(){
        return trance;
    }
    public  String detailInfo(){
        return "";
    }
    public  String specialEvent(){
        return "";
    }

    public void investigate(){
        if(data.d20(Character.getDex()+5)){
            if(!track1){
                trance="你注意到了一些不同寻常的痕迹，似乎有一只凶猛的生物曾经在附近游荡";
                track1=true;
            }
            if(!track2){
                trance="经过你敏锐的调查，你发现这个庞然大物的脚印似乎有些深浅不一，它的腿部好像受伤了";
                track2=true;
            }
        }
    }
}
