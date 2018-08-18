package com.example.cartman.faeronages.game.maps;

import com.example.cartman.faeronages.game.creatures.Boss;
import com.example.cartman.faeronages.game.creatures.bigPig;

import java.util.Random;

public class fungalWastes extends Place {
    private static String[] monsters=new String[]{"腐败者 腐肉","真菌喷射者 剧毒菌丝","蘑菇舌头 舌头","肉灵芝 破损菌盖",
            "沼泽巨人 鳞斑苔藓","蘑菇人 蘑菇","被寄生者 寄生菌丝","人形菌丝堆 剧毒菌丝","腐肉撕咬 钩刃触须","腐肉舔舐者 强腐液体","腐败之形 腐败原体"};
    private String[] monsterDescription=new String[]{"仁慈的","营养不良的",
            "聪慧的","发育中的","发情的","正义的","垂暮的","垂死的","残缺的","善良的",
            "温和的","幼稚的","混乱的"};
    private Boss boss=new bigPig();
    private Random random=new Random();

    public fungalWastes(){}

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
        return "真菌荒地";
    }

    public String toString(){
        return "fungalWastes";
    }
}
