package com.example.cartman.faeronages.game.maps;

import com.example.cartman.faeronages.game.creatures.Boss;
import com.example.cartman.faeronages.game.creatures.bigPig;

import java.util.Random;

public class slum extends Place {
    private static String[] monsters=new String[]{"盗贼 珠宝","小偷 遗失的钱包","强盗 赃物","疯子 绝望眼球","欺骗者 舌头","绝望者 染血破布","小熊维尼 上好的腊肉"
            ,"土匪 赃物","土匪参谋 珠宝","土匪头子 赏金","剧毒蜥蜴 毒腺","死亡沙虫 厚质鳞片"};
    private String[] monsterDescription=new String[]{"仁慈的","营养不良的",
            "聪慧的","发育中的","发情的","正义的","垂暮的","垂死的","残缺的","善良的",
            "温和的","幼稚的","混乱的"};
    private Boss boss=new bigPig();
    private Random random=new Random();

    public slum(){}

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
        return 500;
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
        return "贫民窟";
    }

    @Override
    public String toString(){
        return "slum";
    }
}
