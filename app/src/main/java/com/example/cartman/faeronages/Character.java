package com.example.cartman.faeronages;

import java.util.Random;

public class Character {
    private static Random random=new Random();
    private static int str=0;
    private static int con=0;
    private static int intll=0;
    private static int dex=0;
    private static int cha=0;
    private static int age=0;
    private static String race="human";
    private static String name="slenderMan";

    public static void roll(){
        str=random.nextInt(15)+5;
        con=random.nextInt(15)+5;
        intll=random.nextInt(15)+5;
        dex=random.nextInt(15)+5;
        cha=random.nextInt(15)+5;
    }



    public static void setAge(String aAge){
        age=Integer.getInteger(aAge);
    }
    public static void setRace(String aRace){
        race=aRace;
    }
    public static void setName(String aName){
        name=aName;
    }

    public static String getRace(){return race;
    }
    public static int getStr(){
        return str;
    }
    public static int getCon(){
        return con;
    }
    public static int getIntll(){
        return intll;
    }
    public static int getDex(){
        return dex;
    }
    public static int getCha(){
        return cha;
    }
}
