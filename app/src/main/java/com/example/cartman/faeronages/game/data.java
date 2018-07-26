package com.example.cartman.faeronages.game;


import java.util.Random;

public class data {
    public String[] monsterDescription=new String[]{"仁慈的","痛苦的","绝望的","巨大的","营养不良的","狂暴的","娇小的",
            "聪慧的","发育中的","巨无霸","迷你的","正义的","美味的","垂暮的","垂死的","暗影的","残缺的","善良的",
            "温和的","被诅咒的","经验丰富的","幼稚的","成群的","混乱的"};
    public static String[] beginnersGuide=new String[]{"小野猪 猪肉","小白兔 兔毛","史莱姆 凝胶","野狗 狗牙","小黑兔 黑兔毛",
            "田鼠 鼠皮","食人花 食人花的蕊","小野猪 野猪皮","小豹子 豹子皮","小蝙蝠 蝙蝠翅膀"};
    public static String[] fungalWastes=new String[]{};
    public static String[] restingYards=new String[]{};
    public static String[] limbo=new String[]{};
    public static String[] mechanus=new String[]{};
    public static String[] shore=new String[]{};
    public static String[] slum=new String[]{};
    public static String[] barrenPlain=new String[]{};
    public static int adventureTime(){
        switch (Character.getWhereImGoing()){
            case "beginnersGuide":return 300;
            case "fungalWastes":return 600+bonusTime() ;
            case "restingYards":return 600+bonusTime() ;
            case "limbo":return 600+bonusTime() ;
            case "mechanus":return 600+bonusTime() ;
            case "shore":return 600+bonusTime() ;
            case "slum":return 600+bonusTime() ;
            case "barrenPlain":
                return 600+bonusTime() ;
        }
        return 0;
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