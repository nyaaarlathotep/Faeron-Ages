package com.example.cartman.faeronages.game.maps;

import com.example.cartman.faeronages.game.creatures.Boss;
import com.example.cartman.faeronages.game.creatures.bigPig;

import java.util.Random;

public class barrenPlain extends Place {
    private static String[] monsters=new String[]{"火蝇 火鳞","火蜥蜴 火蜥蜴的蛋","枯树 枯树枝","枯骨 骨片","火舌 活火焰","流动岩浆 岩浆核心"
            ,"秃鹫 厚重羽毛","毒蛇 毒腺","野狗 狗牙","猎豹 豹子皮","成年雄狮 狮皮","田鼠 鼠皮","被诅咒的稻草人 诅咒印记"};
    private String[] monsterDescription=new String[]{"仁慈的","营养不良的",
            "聪慧的","发育中的","发情的","正义的","垂暮的","垂死的","残缺的","善良的",
            "温和的","幼稚的","混乱的"};
    private Boss boss=new bigPig();
    private Random random=new Random();

    public barrenPlain(){}

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
        return "磺芜平原";
    }

    public String toString(){
        return "barrenPlain";
    }
}
