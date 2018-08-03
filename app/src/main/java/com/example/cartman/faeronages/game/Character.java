package com.example.cartman.faeronages.game;


import android.util.Log;
import com.example.cartman.faeronages.game.maps.beginnersGuide;
import java.util.ArrayList;
import java.util.Random;

public class Character {

//    一些任务的本质属性
    private static String name="Bhaal";
    private static jobs job=jobs.fighter;
    private static faiths faith=faiths.Pelor;
    private static races race=races.human;

//    5维
    private static int str=10;//力
    private static int con=10;//体
    private static int intll=10;//智
    private static int dex=10;//敏
    private static int cha=10;//魅


    private static int age=17;
    private static int level=1;

//    装备
    private static String helmet="";
    private static String breastPlate="";
    private static String leftHand="";
    private static String rightHand="";
    private static String legArmor="";
    private static String[] rings=new String[4];
    private static String neckLace="";

//     背包及金钱
    public static ArrayList<String> bag=new ArrayList<>();
    private static int gold=0;

    public static boolean fullBag=false;
    public static boolean haveHarvested=false;
    private static Adventure nextAdventure=new Adventure(new beginnersGuide());

    private static Random random=new Random();


    public static void roll(){
        str=random.nextInt(4)+8;
        con=random.nextInt(4)+8;
        intll=random.nextInt(4)+8;
        dex=random.nextInt(4)+8;
        cha=random.nextInt(4)+8;
        gold=random.nextInt(10)+random.nextInt(10)+random.nextInt(10);
    }

    public static void harvestTrophy(String trophy){
        if(bag.size() <20) {
            bag.add(trophy);
            haveHarvested=true;
            Log.d("Trophy",trophy);
        }else {
            fullBag=true;
        }
    }

    public static String showBag() {
        if (!haveHarvested) {
            return "没能获得战利品";
        } else if(fullBag){
            return "包裹满了！";
        }else{
            haveHarvested=false;
            return "获得战利品" + bag.get(bag.size() - 1);
        }
    }

    public static void die(){

    }


    // get set 方法

    public static void setAge(String aAge){
        age=Integer.parseInt(aAge);
    }
    public static void setRace(races aRace){
        race=aRace;
    }
    public static void setName(String aName){
        name=aName;
    }
    public static void setFaith(faiths aFaith){
        faith=aFaith;
    }
    public static void setJob(jobs aJob){
        job=aJob;
    }


    public static String getBag(){
        String items="";
        for(String thing:bag){
            items=items.concat(thing+"  ");
        }
        return "金币： "+gold+"\n"+items;
    }


    public static Adventure getAdventure(){
        return nextAdventure;
    }


    public static races getRace(){return race;
    }
    public static jobs getJob(){
        return job;}
    public static int getStr(){return str;
    }
    public static int getCon(){return con;
    }
    public static int getIntll(){return intll;
    }
    public static int getDex(){return dex;
    }
    public static int getCha(){return cha;
    }
    public static String getName(){return name;
    }
    public static faiths getFaith(){return faith;
    }
    public static int getAge(){return age;
    }
    public static int getLevel(){
        return level;}
}
