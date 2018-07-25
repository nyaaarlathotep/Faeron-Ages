package com.example.cartman.faeronages.game;

import java.util.Random;

public class Adventure {

    private String[] monsters;
    public Adventure(String[] aMonsters){
        monsters=aMonsters;
    }


    public String smallFight() {
        Random random=new Random();
        data data=new data();

        int des = random.nextInt(data.monsterDescription.length + 17);
        int mon=random.nextInt(monsters.length);
        boolean harvest=random.nextInt(10)>8;
        if (des >= data.monsterDescription.length) {
            if(harvest){
                Character.harvestTrophy(monsters[mon].split(" ")[1]);
            }
            return "正在和" + monsters[mon].split(" ")[0] + "战斗";
        } else if (des > data.monsterDescription.length + 13) {
            return "正在疯狂的逃跑";
        }
        if(harvest){
            Character.harvestTrophy(monsters[mon].split(" ")[1]);
        }
        return "正在和" + data.monsterDescription[des] + monsters[mon].split(" ")[0] + "战斗";

    }


}
