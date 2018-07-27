package com.example.cartman.faeronages.game;


import java.util.Random;

public class data {
    public static String[] hangOut=new String[]{"[放松]正在和自己尬舞","[放松]正在和左手打架","[警戒]正在机敏的巡视四周","[警戒]正在灌木丛中躲藏","[愉悦e]正在生吃史莱姆"
            ,"[放松]正在生吃马卡龙","[警戒]正在担忧接下来的战斗","[修整]正在检查装备","[修整]正在检查武器","[警戒]正在消除自己的踪迹","[修整]正在给伤口消毒","[修整]正在给伤口包扎",
            "这武器a下去怎么有爆炸的声音","[放松]正在洗脸","[警戒]正在搜寻猎物"};

    public  String[] monsterDescription=new String[]{"仁慈的","痛苦的","绝望的","巨大的","营养不良的","狂暴的","娇小的",
            "聪慧的","发育中的","巨无霸","迷你的","正义的","凶恶的","垂暮的","垂死的","暗影的","残缺的","善良的",
            "温和的","被诅咒的","经验丰富的","幼稚的","成群的","混乱的"};
    public static String[] beginnersGuide=new String[]{"小野猪 猪肉","小白兔 兔毛","史莱姆 凝胶","野狗 狗牙","小黑兔 黑兔毛",
            "田鼠 鼠皮","食人花 食人花的蕊","小野猪 野猪皮","小豹子 豹子皮","小蝙蝠 蝙蝠翅膀","小松鼠"};
    public static String[] fungalWastes=new String[]{};
    public static String[] restingYards=new String[]{};
    public static String[] limbo=new String[]{};
    public static String[] mechanus=new String[]{};
    public static String[] shore=new String[]{};
    public static String[] slum=new String[]{};
    public static String[] barrenPlain=new String[]{};
    public static String home="may be it's time to go home";
    public static int adventureTime(){
        switch (Character.getLevel()){
            case 1:return 300;
            default:return 600+bonusTime();
        }
    }

    private static int bonusTime(){
        if(Character.getLevel()<=10){
            return Character.getLevel()/3*300;
        }
        else
            return 1000;
    }

    public static boolean d20(int number){
        Random random=new Random();
        return number>=(random.nextInt(20)+1);
    }
}