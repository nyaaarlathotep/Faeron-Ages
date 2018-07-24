package com.example.cartman.faeronages.game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

public class Adventure {
    private String[] monsters;
    private Random random;
    private String[] description=new String[]{"仁慈的","痛苦的","绝望的","巨大的","营养不良的","狂暴的","娇小的",
            "聪慧的","正在发育的","巨无霸","迷你的","正义的","美味的","垂暮的","垂死的","暗影的","残缺的","善良的",
            "温和的","被诅咒的","经验丰富的","幼稚的","成群的","混乱的"};
    public Adventure(maps map){
        try {
            File myFile=new File(map.toString());
            FileReader fileReader=new FileReader(myFile);
            BufferedReader reader=new BufferedReader(fileReader);
            String line=null;
            while((line=reader.readLine())!=null) {
                monsters=line.split(",");
            }
            reader.close();
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }


    public String smallFight(){
        int des=random.nextInt(description.length+17);
        int mon=random.nextInt(monsters.length);
        if(des>description.length){
            return "正在和" +monsters[mon]+"战斗";
        }
        else if(des>description.length+13){
            return "正在疯狂的逃跑";
        }
        return "正在和"+description[des]+monsters[mon]+"战斗";
    }


}
