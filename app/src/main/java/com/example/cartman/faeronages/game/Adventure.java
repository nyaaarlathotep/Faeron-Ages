package com.example.cartman.faeronages.game;

import com.example.cartman.faeronages.game.creatures.Boss;

import java.util.Random;

public class Adventure {

    private String[] monsters;
    private Boss boss;
    private Random random=new Random();
    public Adventure(String[] aMonsters, Boss aBoss){
        monsters=aMonsters;
        boss=aBoss;
    }


    public String smallFight() {
        data data=new data();

        int des = random.nextInt(data.monsterDescription.length + 17);
        int mon=random.nextInt(monsters.length);
        boolean harvest=random.nextInt(10)>8;
        if (des >= data.monsterDescription.length) {
            if(harvest) {
                if (monsters[mon].split(" ").length > 1) {
                    Character.harvestTrophy(monsters[mon].split(" ")[1]);
                }
            }
            return "对战--与" + monsters[mon].split(" ")[0] + "战斗";
        } else if (des > data.monsterDescription.length + 13) {
            return "正在疯狂的逃跑";
        }
        if(harvest){
            if(monsters[mon].split(" ").length>1) {
                Character.harvestTrophy(monsters[mon].split(" ")[1]);
            }
        }
        return "对战--与" + data.monsterDescription[des] + monsters[mon].split(" ")[0] + "战斗";

    }

    public String hangOut(){
        int number=random.nextInt(data.hangOut.length);
        return data.hangOut[number];
    }

    public String bossTrack(){
        return boss.track();
    }
}
