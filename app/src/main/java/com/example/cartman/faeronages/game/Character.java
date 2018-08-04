package com.example.cartman.faeronages.game;

import android.util.Log;
import com.example.cartman.faeronages.game.maps.beginnersGuide;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



public class Character {

//    一些背景属性
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
    private static String helmet="破旧的头盔";
    private static String breastPlate="破旧的鳞甲";
    private static String rightHand="磨损的长剑";
    private static String leftHand="磨损的小盾";
    private static String legArmor="破旧的鳞甲";
    private static String[] rings=new String[]{"祖传的生命戒指","","",""};
    private static String neckLace="祖传的格挡项链";

//     背包及金钱

    public static ArrayList<String> bag=new ArrayList<>();
    public static String[] specialBag=new String[5];
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

    public static String[] getEquipments(){
        String ring="";
        for(String ss:rings){
            if(!ss.equals("")) {
                ring = ring+" "+ss;
            }
        }
        return new String[]{helmet,breastPlate,leftHand,rightHand,legArmor,ring,neckLace};
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
        switch (aJob){
            case fighter:{
                helmet="破旧的头盔";
                breastPlate="破旧的鳞甲";
                rightHand="磨损的长剑";
                leftHand="磨损的小盾";
                legArmor="破旧的鳞甲";
                rings[0]="祖传的生命戒指";
                neckLace="祖传的格挡项链";
                String[] bornItems="水袋、口粮、睡袋、燧石与铁片、火把".split("、");
                bag=new ArrayList<>(Arrays.asList(bornItems));
                break;
            }
            case bard:{
                helmet="破旧的头巾";
                breastPlate="破旧的布甲";
                rightHand="磨损的短剑";
                leftHand ="磨损的手弩";
                legArmor="破旧的布甲";
                neckLace="祖传的精致哨子";
                specialBag=new String[]{"鲁特琴","","","",""};
                String[] bornItems="水袋、口粮、睡袋、燧石与铁片、火把、附盖提灯".split("、");
                bag=new ArrayList<>(Arrays.asList(bornItems));
                break;
            }
            case druid:{
                helmet="破旧的头环";
                breastPlate="破旧的生皮甲";
                rightHand="磨损的弯刀";
                leftHand="";
                legArmor="磨损的生皮甲";
                neckLace="新鲜的花环";
                rings=new String[]{"","","",""};
                specialBag=new String[]{"鲁特琴","","","",""};
                String[] bornItems="水袋、口粮、睡袋、燧石与铁片、火把".split("、");
                bag=new ArrayList<>(Arrays.asList(bornItems));
                break;
            }
            case cleric:{
                breastPlate="破旧的长袍";
                rightHand="";
                leftHand="老旧的木质节杖";
                legArmor="破旧的绑腿";
                rings[0]="老旧的神圣戒指";
                neckLace="";
                specialBag=new String[]{"木质圣徽","","","",""};
                String[] bornItems="水袋、口粮、睡袋、燧石与铁片、火把".split("、");
                bag=new ArrayList<>(Arrays.asList(bornItems));
                break;
            }
            case rogue:{
                helmet="破旧的头巾";
                breastPlate="破旧的皮甲";
                rightHand="磨损的匕首";
                leftHand="";
                legArmor="破旧的皮甲";
                rings[0]="老旧的潜行戒指";
                neckLace="";
                String[] bornItems="水袋、口粮、睡袋、燧石与铁片、火把、游荡者工具、附盖提灯".split("、");
                bag=new ArrayList<>(Arrays.asList(bornItems));
                break;
            }
            case paladin:{
                helmet="破旧的头盔";
                breastPlate="破旧的鳞甲";
                rightHand="磨损的长剑";
                leftHand="";
                legArmor="破旧的鳞甲";
                rings[0]="老旧的勇气戒指";
                neckLace="祖传的重甲项链";
                String[] bornItems="水袋、口粮、睡袋、燧石与铁片、火把".split("、");
                bag=new ArrayList<>(Arrays.asList(bornItems));
                break;
            }
            case sorcerer:{
                breastPlate="破旧的长袍";
                rightHand="";
                leftHand="老旧的木质节杖";
                legArmor="破旧的绑腿";
                rings[0]="老旧的法术默发戒指";
                neckLace="祖传的固定项链";
                String[] bornItems="水袋、口粮、睡袋、燧石与铁片、火把、墨水、墨水笔、法术材料包、法术书".split("、");
                bag=new ArrayList<>(Arrays.asList(bornItems));
                break;
            }
        }
    }


    public static String getBag(){
        String items="";
        for(String thing:bag){
            items=items.concat(thing+"  ");
        }
        String specials="";
        for(String tt:specialBag){
            specials=specials+tt;
        }
        return "金币： "+gold+"g\n"+"特殊物品：  "+specials+"\n"+"战利品：  "+items;
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
    public static int getIntell(){return intll;
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
