package com.example.cartman.faeronages.game;


import com.example.cartman.faeronages.game.creatures.bigPig;

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
    private static Adventure nextAdventure=new Adventure(data.beginnersGuide,new bigPig());
    public static ArrayList<String> bag=new ArrayList<>();


    private static int level=1;

    public static void roll(){
        str=random.nextInt(4)+8;
        con=random.nextInt(4)+8;
        intll=random.nextInt(4)+8;
        dex=random.nextInt(4)+8;
        cha=random.nextInt(4)+8;
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
    public static int getLevel(){return level;}
}
