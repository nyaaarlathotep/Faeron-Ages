package com.example.cartman.faeronages.game.creatures;


import android.content.Intent;
import android.util.Log;
import com.example.cartman.faeronages.game.data;
import com.example.cartman.faeronages.game.Character;

public class bigPig extends Boss {
    private boolean spotTrack=false;

    private boolean[] choices=new boolean[5];
    private int rounds=0;
    private int health;
    private int luck=0;

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
                    luck=luck+1;
                    return "经过你敏锐的调查，你发现这个庞然大物的身形似乎有些不协调，它的腿脚有些不利索";
                }else {
                    if(data.shownD20(12)) {
                        return "[进攻]老母猪使用猪突猛进\n你不成熟的进攻计划被老母猪轻易挫败,你险之又险的躲过老母猪的冲击并准备还击";
                    }else {
                        luck=luck-2;
                        return "[进攻]老母猪使用猪突猛进\n你不成熟的进攻计划被老母猪轻易挫败,你被顶飞到了一旁的树上";
                    }
                }
            }
            case 2:{
                if(choices[1]){
                    if(data.shownD20(11)) {
                        luck=luck+1;
                        return "[进攻]老母猪使用猪牙撕咬\n你凭借敏捷的身法秀了老母猪一脸，躲开了攻击的同时又痛击了它的猪头";
                    }else {
                        luck=luck-2;
                        return "[进攻]老母猪使用猪牙撕咬\n你巧妙地躲避老母猪的攻击，可还是在攻击猪头是被猪牙蹭到了";
                    }
                }else {
                    luck=luck+2;
                    return "[进攻]老母猪使用猪牙撕咬\n你凭借敏捷的身法躲开了攻击，并顺便攻击了它的猪腿";
                }
            }
            case 3:{
                    if(choices[1]){
                        if(choices[2]) {
                            if(data.shownD20(10)){
                                return "被攻击了猪头的老母猪陷入暴怒，你用自己的生命开了次玩笑,险之又险的躲了过去";
                            }else {
                                luck=luck-2;
                                return "被攻击了猪头的老母猪陷入暴怒，你用自己的生命开了次玩笑,尽管你努力尝试，还是被老母猪拱到了";
                            }
                        }else {
                            return "被攻击了猪头的老母猪陷入暴怒,它莽撞地向你攻来，早有准备的你躲到了一旁";
                        }
                    }else {
                        if(choices[2]){
                            luck=luck+2;
                            return "被攻击了猪腿的老母猪行动更加迟缓，你轻松地与老母猪兜着圈子并伺机输出";
                        }else {
                            luck=luck+1;
                            return "老母猪移动着身子，始终面朝着你，蓄势待发，但你注意到它的动作明显受到伤腿的影响而变得迟缓";
                        }
                    }
            }
            case 4:{
                if(data.shownD20(16)){
                    return "干脆利落的一击！老母猪沉重的身躯倒下了，精疲力尽的你坐在了一旁的树下";
                }else {
                    data.die();
                    return "哦不！运气奇差的你连一头新手村的母猪得没打过，真实非洲人，太惨了";
                }
            }
        }
        return "越界";
    }

    @Override
    public  String battleChoiceContent(boolean choice){
        switch (rounds){
            case 0:{
                if(choice){
                    return "仔细观察一番: 先迂回周旋一下";
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
                    return "乘胜追击， 一鼓作气痛打老母猪";
                }else {
                    return "先稳一波， 观察一下形势";
                }
            }
            case 3:{
                if(choice){
                    return "是时候了结这场战斗了，我要从左侧使用"+"普通攻击"+"终结这只老母猪";
                }else {
                    return "是时候了结这场战斗了，我要从右侧使用"+"普通攻击"+"终结这只老母猪";
                }
            }
            case 4:{
                if (choice) {
                    return "你处理了并收获了战利品，是时候回到镇子处理怪物素材，更新升级装备了";
                }else {
                    return "这是一个值得尊敬的对手，是时候回到镇子处理怪物素材，更新升级装备了";
                }
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
    public String bossChoose(boolean choice) {
        Log.d("bossChoose",choice+"");
        if(rounds==4){
            if(choice) {
                Character.harvestTrophy("老母猪的大猪牙");
            }
            return "end";
        }
        choices[rounds]=choice;
        rounds=rounds+1;
        return "";
    }
}
