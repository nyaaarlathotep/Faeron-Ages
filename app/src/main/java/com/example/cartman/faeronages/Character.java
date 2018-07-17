package com.example.cartman.faeronages;

import java.util.Random;

public class Character {
    private Random random=new Random();
    private int str=0;
    private int con=0;
    private int intll=0;
    private int dex=0;
    private int cha=0;

    public Character(){
        str=random.nextInt(15)+5;
        con=random.nextInt(15)+5;
        intll=random.nextInt(15)+5;
        dex=random.nextInt(15)+5;
        cha=random.nextInt(15)+5;
    }
    public int getStr(){
        return str;
    }
    public int getCon(){
        return con;
    }
    public int getIntll(){
        return intll;
    }
    public int getDex(){
        return dex;
    }
    public int getCha(){
        return cha;
    }
}
