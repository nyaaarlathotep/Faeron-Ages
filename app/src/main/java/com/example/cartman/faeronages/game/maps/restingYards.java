package com.example.cartman.faeronages.game.maps;

import com.example.cartman.faeronages.game.creatures.Boss;
import com.example.cartman.faeronages.game.creatures.bigPig;

import java.util.Random;

public class restingYards extends Place {
    private static String[] monsters=new String[]{"活尸 干瘪肢体","食尸鬼 感染血液","游荡鬼魂 弃尸灵魂碎片","骷髅 骸骨","食腐野狗 带病狗牙"
            ,"守墓人 布衣残片","伪形者 弃尸灵魂残片","游荡恶魂 弃尸灵魂残片","盗墓人 遗物","拼接巨尸 破碎肢体","腐肉堆积者","瘟疫散播者 感染腐肉","瘟疫活尸 感染腐肉"};
    private String[] monsterDescription=new String[]{"仁慈的","营养不良的",
            "聪慧的","发育中的","发情的","正义的","垂暮的","垂死的","残缺的","善良的",
            "温和的","幼稚的","混乱的"};
    private Boss boss=new bigPig();
    private Random random=new Random();

    public restingYards(){}

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
        return "安溪庭院";
    }

    @Override
    public String toString(){
        return "restingYards";
    }
}
