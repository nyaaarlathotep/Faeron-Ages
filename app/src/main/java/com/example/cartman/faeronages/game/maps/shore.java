package com.example.cartman.faeronages.game.maps;

import com.example.cartman.faeronages.game.creatures.Boss;
import com.example.cartman.faeronages.game.creatures.bigPig;

import java.util.Random;

public class shore extends Place {
    private static String[] monsters=new String[]{"发狂的渔夫 麻布","海盗掠夺者 钩刃","海盗屠戮者 弯刀"
            ,"海盗参谋 珠宝","鱼人守卫 鱼鳍","海洋嗜血者 鱼骨","深海掠夺者 鱼人骨","深海巨口 巨型骸骨","鲸鲨骑手 海洋守护","深海恐惧 潮汐使者"};
    private String[] monsterDescription=new String[]{"仁慈的","营养不良的",
            "聪慧的","发育中的","发情的","正义的","垂暮的","垂死的","残缺的","善良的",
            "温和的","幼稚的","混乱的"};
    private Boss boss=new bigPig();
    private Random random=new Random();

    public shore(){}

    //    返回可能带有修饰的怪物
    public  String smallMonster() {
        int des = random.nextInt(monsterDescription.length + 17);
        int mon = random.nextInt(monsters.length);
        if (des >= monsterDescription.length) {
            return monsters[mon];
        } else {
            return monsterDescription[des] + monsters[mon];
        }
    }

    @Override
    public void investigate(){
        boss.beSeeked();
    }

    @Override
    public String environment() {
        return boss.track();
    }

    @Override
    public int adventureTime(){
        return 300;
    }

    @Override
    public boolean knowBoss(){
        return boss.spotted();
    }

    @Override
    public String battleInfo() {
        return boss.battleInfo();
    }

    @Override
    public String battleChoiceContent(boolean choice){
        if(boss.battleChoiceContent(choice).equals("freeFight")){
            return "freeFight";
        }else {
            return boss.battleChoiceContent(choice);
        }
    }

    @Override
    public String bossChoose(boolean choice) {
        return boss.bossChoose(choice);
    }

    @Override
    public String getName() {
        return "潮湿海岸";
    }

    @Override
    public String toString(){
        return "shore";
    }
}
