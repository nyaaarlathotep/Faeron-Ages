package com.example.cartman.faeronages.game.creatures;


import com.example.cartman.faeronages.game.data;
import com.example.cartman.faeronages.game.Character;

public class bigPig extends Boss {
    private boolean spotTrack=false;

    private boolean[] choices=new boolean[5];
    private int rounds=0;
    public boolean isOption1Used;
    public boolean isOption2Used;
    private int health;

    public bigPig(){

    }
    public String track(){
        if(!spotTrack) {
            return "啊～，今天也是好天気☆～";
        }
        else {
            return "你注意到了一些不同寻常的痕迹，似乎有一只凶猛的生物曾经在附近游荡";
        }
    }
    public  String battleInfo(){
        switch (rounds){
            case 0:{

            }
        }
        return "经过你敏锐的调查，你发现这个庞然大物的脚印似乎有些深浅不一，它的腿部好像受伤了";
    }

    public  String battleChoice(){
        return "";
    }

    public void beSeeked(){
        boolean seekSecceed=data.d20(5+Character.getDex());
        if(seekSecceed){
            spotTrack=true;
        }
    }
    public boolean spotted(){
        return spotTrack;
    }
}
