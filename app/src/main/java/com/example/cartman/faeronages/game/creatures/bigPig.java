package com.example.cartman.faeronages.game.creatures;


import android.util.Log;
import com.example.cartman.faeronages.game.data;
import com.example.cartman.faeronages.game.Character;

public class bigPig extends Boss {
    private boolean spotTrack=false;

    private boolean[] choices=new boolean[5];
    private int rounds=0;
    private int health;

    public bigPig(){

    }

    @Override
    public String track(){
        if(!spotTrack) {
            return "啊～，今天也是好天気☆～";
        }
        else {
            return "你注意到了一些不同寻常的痕迹，似乎有一只凶猛的生物曾经在附近游荡";
        }
    }

    @Override
    public  String battleInfo(){
        switch (rounds){
            case 0:{
                return "一头壮硕的老母猪倏地从灌木丛中钻了出来，它暴躁不安地摇晃着它的猪头，看来一场大战在所难免。";
            }
            case 1:{
                if(choices[0]){
                    return "经过你敏锐的调查，你发现这个庞然大物的身形似乎有些不协调，它的腿脚有些不利索";
                }else {
                    return "[进攻]老母猪使用猪突猛进\n你不成熟的进攻计划被老母猪轻易挫败,你险之又险的躲过老母猪的冲击并准备还击";
                }
            }
            case 2:{
                if(choices[1]){
                    return "[进攻]老母猪使用猪牙撕咬\n你凭借敏捷的身法秀了老母猪一脸，躲开了攻击的同时又痛击了它的猪头";
                }else {
                    return "[进攻]老母猪使用猪牙撕咬\n你凭借敏捷的身法侧面躲开了攻击，并顺便攻击了它的猪腿";
                }
            }
            case 3:{
                
            }
        }
        return "越界";
    }

    @Override
    public  String battleChoiceContent(boolean choice){
        switch (rounds){
            case 0:{
                if(choice){
                    return "仔细观察一番: 先周旋一下";
                }else {
                    return "猛男直接就干：你直接冲向老母猪";
                }
            }
            case 1:{
                if(choice){
                    return "打爆它的猪头";
                }else {
                    return "打断它的猪腿";
                }
            }
            case 2:{
                if(choice){
                    return "乘胜追击，一鼓作气痛打老母猪";
                }else {
                    return "先稳一波，观察一下形势";
                }
            }
            case 3:{

            }
        }
        return "越界";
    }

    @Override
    public void beSeeked(){
        boolean seekSecceed=data.d20(5+Character.getDex());
        if(seekSecceed){
            spotTrack=true;
        }
    }

    @Override
    public boolean spotted(){
        return spotTrack;
    }

    @Override
    public void bossChoose(boolean choice) {
        Log.d("wadas","bossChoose");
        choices[rounds]=choice;
        rounds=rounds+1;
    }
}
