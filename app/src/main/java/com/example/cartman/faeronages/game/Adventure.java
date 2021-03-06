package com.example.cartman.faeronages.game;


import android.util.Log;

import com.example.cartman.faeronages.game.maps.Place;

import java.util.Random;

public class Adventure {

    private Random random=new Random();
    private Place map;
    public Adventure(Place Amap){
        map=Amap;
    }


    public String smallFight(){
        boolean harvest=random.nextInt(10)>8;
        boolean escape=data.d20(1);
        String monster=map.smallMonster();
        if(escape){
            return "[害怕]正在迅速逃跑";
        }else {
            if(harvest){
                if(monster.split(" ").length>1) {
                    Character.harvestTrophy(monster.split(" ")[1]);
                }
            }
            return "[战斗]正在与"+monster.split(" ")[0]+"战斗";
        }
        }
        public  int getTime(){
        return map.adventureTime();
        }

        public String hangOut(){
        int number=random.nextInt(data.hangOut.length);
        return data.hangOut[number];
    }

    public void investigate(){
        map.investigate();
    }

    public String environment(){
        return map.environment();
    }

    public boolean knowBoss(){
        return map.knowBoss();
    }

    public String battleInfo(){
        return map.battleInfo();
    }

    public String battleChoiceContent(boolean choice){
        return map.battleChoiceContent(choice);
    }

    public String iChooseA(){
        Log.d("iChooseA","a");
        return map.bossChoose(true);
    }
    public String iChooseB(){
        Log.d("iChooseB","b");
        return map.bossChoose(false);
    }

    public Place getMap() {
        return map;
    }
}
