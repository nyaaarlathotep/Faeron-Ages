package com.example.cartman.faeronages.game;

import android.util.Log;
import android.widget.ProgressBar;

import com.example.cartman.faeronages.game.maps.Place;
import com.example.cartman.faeronages.game.maps.beginnersGuide;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



public class Character {

    //    一些背景属性
    private static String name = "Bhaal";
    private static jobs job = jobs.fighter;
    private static faiths faith = faiths.Pelor;
    private static races race = races.human;

//    0是秩序度，1是善良度，这是阵营数据
    private static int[] camp={0,0};
    private static int[] prestige=new int[]{0,0,0,0,0,0};
    private static int[] godPrestige=new int[]{0,0,0,0,0,0};

    //    5维
    private static int str = 10;//力
    private static int con = 10;//体
    private static int intll = 10;//智
    private static int dex = 10;//敏
    private static int cha = 10;//魅

    private static int age=17;
    private static int level=1;

//    装备
    private static String helmet="破旧的头盔.0";
    private static String breastPlate="破旧的鳞甲.0";
    private static String leftHand="磨损的小盾.0";
    private static String rightHand="磨损的长剑.0";
    private static String legArmor="破旧的鳞甲.0";
    private static String rings="祖传的生命戒指.0";
    private static String neckLace="祖传的格挡项链.0";
    private static int[] strengthLevel={0,0,0,0,0,0,0};

//    法术
    private static String[] spells=new String[]{"","","","","","",""};

//    任务列表
    private static ArrayList<String> missionList=new ArrayList<>();
    private static ArrayList<Place> missionMap=new ArrayList<>();
    private static ArrayList<String> missionFinished=new ArrayList<>();

//    背包及金钱
    public static ArrayList<String> bag=new ArrayList<>();
    public static ArrayList<String> livingBag=new ArrayList<>(Arrays.asList("水袋、口粮、睡袋、燧石与铁片、火把".split("、")));
    public static String[] specialBag = new String[]{"", "", "", "", ""};
    private static double gold = 1000.0;


    public static boolean fullBag = false;
    public static boolean haveHarvested = false;
    private static Adventure nextAdventure = new Adventure(new beginnersGuide());
    private static int levelMark=0;

    private static Random random = new Random();


    public static void roll() {
        str = random.nextInt(4) + 8;
        con = random.nextInt(4) + 8;
        intll = random.nextInt(4) + 8;
        dex = random.nextInt(4) + 8;
        cha = random.nextInt(4) + 8;
//        gold = random.nextInt(10) + random.nextInt(10) + random.nextInt(10);
    }

    public static void harvestTrophy(String trophy) {
        if (bag.size() < 20) {
            bag.add(trophy);
            haveHarvested = true;
            Log.d("Trophy", trophy);
        } else {
            fullBag = true;
        }
    }

    public static String showBag() {
        if (!haveHarvested||bag.size()==0) {
            return "没能获得战利品";
        } else if (fullBag) {
            return "包裹满了！";
        } else {
            haveHarvested = false;
            return "获得战利品" + bag.get(bag.size() - 1);
        }
    }

    public static void die() {

    }



    public static String[] getShownEquipments() {
        String[] asd=new String[]{helmet.split("\\.")[0], breastPlate.split("\\.")[0], leftHand.split("\\.")[0],rightHand.split("\\.")[0]
                ,legArmor.split("\\.")[0], rings.split("\\.")[0], neckLace.split("\\.")[0]};
        for(int i=0;i<asd.length;i++){
            if(strengthLevel[i]!=0){
                asd[i]="+"+strengthLevel[i]+asd[i];
            }
        }
        return asd;
    }

    public static void addMission(String mission){
        missionList.add(mission);
    }

    public static boolean strengthEquipment(int ww){
        int index=random.nextInt(5);
        switch (ww){
            case 1:{
                if(data.d20(18)){
                    strengthLevel[index]=strengthLevel[index]+1;
                    return true;
                }
            }
            case 2:{
                if(data.d20(15)){
                    strengthLevel[index]=strengthLevel[index]+2;
                    return true;

                }
            }
            case 5:{
                if(data.d20(10)){
                    strengthLevel[index]=strengthLevel[index]+5;
                    return true;
                }
            }
            default:
        }
        return false;
    }

            // get set 方法

    public static void setAge(String aAge) {
        age = Integer.parseInt(aAge);
    }

    public static void setRace(races aRace) {
        race = aRace;
    }

    public static void setName(String aName) {
        name = aName;
    }

    public static void setFaith(faiths aFaith) {
        faith = aFaith;
    }

    public static void setJob(jobs aJob) {
        job = aJob;
    }

    public static void check(){
        switch (job) {
            case fighter: {
                helmet = "破旧的头盔.0";
                breastPlate = "破旧的鳞甲.0";
                rightHand = "磨损的长剑.0";
                leftHand = "磨损的小盾.0";
                legArmor = "破旧的鳞甲.0";
                rings = "祖传的生命戒指.0";
                neckLace = "祖传的格挡项链.0";
                livingBag = new ArrayList<>(Arrays.asList("水袋、口粮、睡袋、燧石与铁片、火把".split("、")));
                break;
            }
            case bard: {
                helmet = "破旧的头巾.0";
                breastPlate = "破旧的布甲.0";
                rightHand = "磨损的短剑.0";
                leftHand = "磨损的手弩.0";
                legArmor = "破旧的布甲.0";
                neckLace = "祖传的精致哨子.0";
                specialBag = new String[]{"鲁特琴", "", "", "", ""};
                spells = new String[]{"","","","","","",""};
                livingBag = new ArrayList<>(Arrays.asList("水袋、口粮、睡袋、燧石与铁片、火把、附盖提灯".split("、")));
                break;
            }
            case druid: {
                helmet = "破旧的头环.0";
                breastPlate = "破旧的生皮甲.0";
                rightHand = "磨损的弯刀.0";
                leftHand = "";
                legArmor = "磨损的生皮甲.0";
                neckLace = "新鲜的花环.0";
                rings =" .0";
                specialBag = new String[]{"鲁特琴", "", "", "", ""};
                spells = new String[]{"","","","","","",""};
                String[] bornItems = "水袋、口粮、睡袋、燧石与铁片、火把".split("、");
                livingBag = new ArrayList<>(Arrays.asList(bornItems));
                break;
            }
            case cleric: {
                breastPlate = "破旧的长袍.0";
                rightHand = "";
                leftHand = "老旧的木质节杖.0";
                legArmor = "破旧的绑腿.0";
                rings = "老旧的神圣戒指.0";
                neckLace = " .0";
                specialBag = new String[]{"木质圣徽", "", "", "", ""};
                spells = new String[]{"","","","","","",""};
                String[] bornItems = "水袋、口粮、睡袋、燧石与铁片、火把".split("、");
                livingBag = new ArrayList<>(Arrays.asList(bornItems));
                break;
            }
            case rogue: {
                helmet = "破旧的头巾.0";
                breastPlate = "破旧的皮甲.0";
                rightHand = "磨损的匕首.0";
                leftHand = "";
                legArmor = "破旧的皮甲.0";
                rings = "老旧的潜行戒指.0";
                neckLace = " .0";
                String[] bornItems = "水袋、口粮、睡袋、燧石与铁片、火把、游荡者工具、附盖提灯".split("、");
                livingBag = new ArrayList<>(Arrays.asList(bornItems));
                break;
            }
            case paladin: {
                helmet = "破旧的头盔.0";
                breastPlate = "破旧的鳞甲.0";
                rightHand = "磨损的长剑.0";
                leftHand = "磨损的小盾.0";
                legArmor = "破旧的鳞甲.0";
                rings = "老旧的勇气戒指.0";
                neckLace = "祖传的重甲项链.0";
                spells = new String[]{"","","","","","",""};
                String[] bornItems = "水袋、口粮、睡袋、燧石与铁片、火把".split("、");
                livingBag = new ArrayList<>(Arrays.asList(bornItems));
                break;
            }
            case sorcerer: {
                breastPlate = "破旧的长袍.0";
                rightHand = "";
                leftHand = "老旧的木质节杖.0";
                legArmor = "破旧的绑腿.0";
                rings = "老旧的法术默发戒指.0";
                neckLace = "祖传的固定项链.0";
                spells = new String[]{"","","","","","",""};
                String[] bornItems = "水袋、口粮、睡袋、燧石与铁片、火把、墨水、墨水笔、法术材料包、法术书".split("、");
                livingBag = new ArrayList<>(Arrays.asList(bornItems));
                break;
            }
        }
        switch (faith){
            case Pelor:{
                camp[1]=camp[1]+30;
                prestige[2]=prestige[2]+5;
                prestige[3]=prestige[3]+5;
                prestige[5]=prestige[5]+15;
                break;
            }
            case Boccob:{
                break;
            }
            case Heironeous:{
                camp[0]=camp[0]+20;
                prestige[5]=prestige[5]+5;
                prestige[3]=prestige[3]+10;
                break;
            }
            case Olidammara:{
                camp[0]=camp[0]-20;
                prestige[3]=prestige[3]-10;
                break;

            }
            case StCuthbert:{
                camp[0]=camp[0]+20;
                prestige[3]=prestige[3]+20;
                prestige[5]=prestige[5]+5;
                break;

            }
            case CorellonLarethian:{
                camp[0]=camp[0]-20;
                camp[1]=camp[1]+30;
                prestige[4]=prestige[4]-5;
                prestige[5]=prestige[5]+5;
                prestige[3]=prestige[3]-10;
                break;
            }
        }
    }

    public static boolean purchase(double price){
        if(price<=gold){
            gold=gold-price;
            return true;
        }else {
            return false;
        }
    }

            public static String getBag(){
                String items="";
                for(String thing:bag){
                    items=items.concat(thing+"  ");
                }
                String specials="";
                for(String tt:specialBag){
                    specials=specials.concat(" "+tt);
                }
                String alwaysHave="";
                for(String aa:livingBag){
            alwaysHave=alwaysHave.concat(" "+aa);
        }
        return "金币： "+gold+"g\n"+"特殊物品：  "+specials+"\n"+"冒险背包：  "+alwaysHave+"\n"+"战利品：  "+items;
    }

    public static String showSpells(){
        String result="";
        int le=0;
        for(String spell:spells){
            if(!spell.equals("")){
                result=result.concat(le+"级法术： "+spell+"\n");
            }
            le=le+1;
        }
        return result;
    }


    public static void addSpell(String spell,String index){
        int aaa=Integer.parseInt(index);
        spells[aaa]=spells[aaa]+"\n"+spell;
    }

//    这个函数完全按照town中事件与data中装备的index安排，千万别用
    public static int getEquipmentPoint(String index){
        switch (index){
            case "0":{
                return Integer.parseInt(helmet.split("\\.")[1]);
            }
            case "1":{
                return Integer.parseInt(leftHand.split("\\.")[1]);
            }
            case "2":{
                return Integer.parseInt(rightHand.split("\\.")[1]);
            }
            case "3":{
                return Integer.parseInt(breastPlate .split("\\.")[1]);
            }
            case "4":{
                return Integer.parseInt(legArmor.split("\\.")[1]);
            }
            case "5":{
                return Integer.parseInt(rings.split("\\.")[1]);
            }
            case "6":{
                return Integer.parseInt(neckLace.split("\\.")[1]);
            }
            default:
                return -1;
        }
    }
    public static void sellBag(){
        int item=bag.size();
        gold=gold+item*level;
        bag=new ArrayList<>();
    }
    public static void addMap(Place map){
        missionMap.add(map);
    }
    public static void checkMission(){
        ArrayList<String> temp=new ArrayList<>();
        ArrayList<Place> ttemp=new ArrayList<>();
        for(int i=0;i<missionMap.size();i++){
            if(missionMap.get(i).equals(nextAdventure.getMap())){
                for(int j=0;j<missionMap.size();j++) {
                    if (j!=i) {
                        temp.add(missionList.get(j));
                        ttemp.add(missionMap.get(j));
                    }
                }
            }
        }
        missionMap=ttemp;
        missionList=temp;
    }
    public static void experience(){
        if(level<5){
            level=level+1;
        }else if(level<10){
            levelMark=levelMark+1;
            if(levelMark>=3){
                levelMark=0;
                level=level+1;
            }
        }else {
            levelMark=levelMark+1;
            if(levelMark>=5){
                levelMark=0;
                level=level+1;
            }
        }
    }

    private static void grow(){
        switch (job){
            case sorcerer:{
                int rando=random.nextInt(3);
                if(rando==0){
                    intll=intll+1;
                    break;
                }else if(rando==1){
                    con=con+1;
                    break;
                }else {
                    rando=random.nextInt(3);
                    if(rando==0){
                        str=str+1;
                        break;
                    }else if(rando==1){
                        cha=cha+1;
                        break;
                    }else if(rando==2){
                        dex=dex+1;
                    }
                }
                break;
            }
            case paladin:{
                int rando=random.nextInt(4);
                if(rando==0){
                    str=str+1;
                    break;
                }else if(rando==1){
                    con=con+1;
                    break;
                }else if(rando==2){
                    dex=dex+1;
                }else {
                    rando=random.nextInt(3);
                    if(rando==0){
                        intll=intll+1;
                        break;
                    }else if(rando==1){
                        cha=cha+1;
                        break;
                    }else if(rando==2){
                        str=str+1;
                    }
                }
                break;
            }
            case rogue:{
                int rando=random.nextInt(3);
                if(rando==0){
                    dex=dex+1;
                    break;
                }else if(rando==1){
                    str=str+1;
                    break;
                }else {
                    rando=random.nextInt(3);
                    if(rando==0){
                        con=con+1;
                        break;
                    }else if(rando==1){
                        cha=cha+1;
                        break;
                    }else if(rando==2){
                        intll=intll+1;
                    }
                }
                break;
            }
            case cleric:{
                int rando=random.nextInt(3);
                if(rando==0){
                    intll=intll+1;
                    break;
                }else if(rando==1){
                    cha=cha+1;
                    break;
                }else {
                    rando=random.nextInt(3);
                    if(rando==0){
                        str=str+1;
                        break;
                    }else if(rando==1){
                        con=con+1;
                        break;
                    }else if(rando==2){
                        dex=dex+1;
                    }
                }
                break;
            }
            case druid:{
                int rando=random.nextInt(4);
                if(rando==0){
                    cha=cha+1;
                    break;
                }else if(rando==1){
                    con=con+1;
                    break;
                }else if(rando==2){
                    dex=dex+1;
                }else {
                    rando=random.nextInt(3);
                    if(rando==0){
                        intll=intll+1;
                        break;
                    }else if(rando==1){
                        str=str+1;
                        break;
                    }else if(rando==2){
                        dex=dex+1;
                    }
                }
                break;
            }
            case bard:{
                int rando=random.nextInt(4);
                if(rando==0){
                    cha=cha+1;
                    break;
                }else if(rando==1){
                    con=con+1;
                    break;
                }else if(rando==2){
                    dex=dex+1;
                }else {
                    rando=random.nextInt(3);
                    if(rando==0){
                        intll=intll+1;
                        break;
                    }else if(rando==1){
                        str=str+1;
                        break;
                    }else if(rando==2){
                        cha=cha+1;
                    }
                }
                break;
            }
            case fighter:{
                int rando=random.nextInt(4);
                if(rando==0){
                    str=str+1;
                    break;
                }else if(rando==1){
                    con=con+1;
                    break;
                }else if(rando==2){
                    dex=dex+1;
                }else {
                    rando=random.nextInt(3);
                    if(rando==0){
                        intll=intll+1;
                        break;
                    }else if(rando==1){
                        cha=cha+1;
                        break;
                    }else if(rando==2){
                        str=str+1;
                    }
                }
                break;
            }
        }
    }

    public static void setHelmet(String aHelmet){
        helmet=aHelmet;
    }
    public static void setBreastPlate(String aBreastPlate){
        breastPlate=aBreastPlate;
    }
    public static void setLeftHand(String aLeftHand){
        leftHand=aLeftHand;
    }
    public static void setRightHand(String aRightHand){
        rightHand=aRightHand;
    }
    public static void setLegArmor(String alegArmor){
        legArmor=alegArmor;
    }
    public static void setRings(String aRings){
        rings=aRings;
    }
    public static void setNeckLace(String aNeckLace){
        neckLace=aNeckLace;
    }
    public static void setNextAdventure(Adventure adventure){
        nextAdventure=adventure;
    }


    public static double getGold(){
        return gold;
    }
    public static Adventure getAdventure(){ return nextAdventure;
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
    public static int getLevel() {
        return level;
    }
    public static int[] getCamp(){
        return camp;
    }
    public static ArrayList<String> getMission() {
        return missionList;
    }
    public static int getPrestige(int index,boolean isGod){
        if(isGod){
            return godPrestige[index];
        }else {
            return prestige[index];
        }
    }
    public static String[] getSpells(){
        return spells;
    }
}
