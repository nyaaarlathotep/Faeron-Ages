package com.example.cartman.faeronages.game;


import java.util.ArrayList;
import java.util.Random;

public class Character {
    private static Random random=new Random();
    private static int str=0;
    private static int con=0;
    private static int intll=0;
    private static int dex=0;
    private static int cha=0;
    private static int age=17;
    private static String name="Bhaal";
    private static jobs job=jobs.fighter;
    private static faiths faith=faiths.Pelor;
    private static races race=races.human;
    private static String whereImGoing="beginnersGuide";
    public static ArrayList<String> bag=new ArrayList<>();


    private static int level=1;

    public static void roll(){
        str=random.nextInt(15)+5;
        con=random.nextInt(15)+5;
        intll=random.nextInt(15)+5;
        dex=random.nextInt(15)+5;
        cha=random.nextInt(15)+5;
    }

    public static void harvestTrophy(String trophy){
        if(bag.size()
                <20) {
            bag.add(trophy);
        }
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

    public static String[] getMonsters(){
        switch (whereImGoing){
            case "beginnersGuide":return data.beginnersGuide;
            case "fungalWastes":return data.fungalWastes;
            case "restingYards":return data.restingYards;
            case "limbo":return data.limbo;
            case " mechanus":return data.mechanus;
            case "shore":return data.shore;
            case "slum":return data.slum;
            case "barrenPlain":return data.barrenPlain;
        }
        return null;
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
}
