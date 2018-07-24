package com.example.cartman.faeronages.game;

import com.example.cartman.faeronages.game.faiths;
import com.example.cartman.faeronages.game.jobs;
import com.example.cartman.faeronages.game.races;

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
    private static maps whereImGoing=maps.beginnersGuide;

    private static int level=0;

    public static void roll(){
        str=random.nextInt(15)+5;
        con=random.nextInt(15)+5;
        intll=random.nextInt(15)+5;
        dex=random.nextInt(15)+5;
        cha=random.nextInt(15)+5;
    }



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

    public static maps getWhereImGoing(){ return whereImGoing;
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
