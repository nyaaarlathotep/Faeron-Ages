package com.example.cartman.faeronages.game;


import android.util.Log;

import com.example.cartman.faeronages.game.maps.Place;
import com.example.cartman.faeronages.town;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Town {
    private Random random=new Random();
    private int level;
    private int round=0;
    private int event=0;
    private String[] options=new String[3];
    private ArrayList<String> moves;
    private Place[] places=new Place[3];
    private boolean needChoose=false;
    private boolean isFree=false;
    private String[] townEvents=new String[]{"啤酒节！\n是时候放开肚皮喝了，今天的酒水统统不要钱","黑死病\n整个个城镇的居民都缩在自己的家中瑟瑟发抖",
            "巧遇行商\n你正好遇到了在这座城镇歇脚的行商，他可能有很多好东西","工会解放\n这座城镇的工会负责人死了！全体工会员工都在庆祝","船新的铁匠\n年轻的学徒自立门户，他会给所有顾客一点优惠",
            "巧遇严打\n镇上来了一伙圣骑士，动不动就给路人上侦测阵营","痔疮犯了\n这下可没有你最喜欢的窑子环节了","黑市集会\n正巧你遇到了黑市集会，说不定有什么好东西"};
    public Town(int aLevel) {
        level = aLevel;
        moves=new ArrayList<>();
        moves.addAll(Arrays.asList("正在和贪婪的材料商讨价还价","正在小酒馆的角落狼吞虎咽","正在旅馆的硬板床上呼呼大睡","正在城镇中四处闲逛","正在和工会的接待员打哈哈",
                "正在寻找可以完成的任务","正在办理手续接任务","正在铁匠铺保养装备","正在说服铁匠给你强化装备", "正在欣赏昂贵的装备"
                ,"正在补充冒险工具背包","正在城镇里休息最后一个夜晚","正在准备自己的装备，准备出发"));
        switch (Character.getJob()){
            case sorcerer:{
                moves.add(11,"正在房间里练习魔法");
                moves.add(12,"正在和自己创造的魔法纸片人聊天");
                break;
            }
            case paladin:{
                moves.add(11,"正在教堂中孤独地祷告");
                moves.add(12,"正在尝试去接受并享受鞭笞");
                break;

            }
            case rogue:{
                moves.add(11,"正在给贫民窟的饿殍变戏法");
                moves.add(12,"正在为自己的过去而痛苦与绝望");
                break;

            }
            case cleric:{
                moves.add(11,"正在教堂中孤独地祷告");
                moves.add(12,"正在参加传统的娈童活动");
                break;

            }
            case druid:{
                moves.add(11,"正在为枯死的老树落泪");
                moves.add(12,"正在独自为一旁的小树苗浇水");
                break;

            }
            case bard:{
                moves.add(11,"正在小酒馆内传颂远方的传奇");
                moves.add(12,"正在和当地的地头蛇称兄道弟");
                break;

            }
            case fighter:{
                moves.add(11,"正在小酒馆和人蛤啤吹牛逼");
                moves.add(12,"正在醉酒后寻衅滋事");
                break;

            }
        }
    }

    public String getTownEvent(){
        if(random.nextBoolean()){
            int event=random.nextInt(townEvents.length);
            if(event==2){
                moves.add(1,"正在和查看行商的物品");
            }else if(event==7){
                moves.add(1,"正在黑市里闲逛");
            }
            return townEvents[event];
        }else {
            return "又是平常的一天，平凡的小镇在它的秩序下运转着";
        }
    }

//    由于round的更新在gerMove内所以调用时一定要把getMove放在后面，防止round产生错乱
    public String getMove(){
        if(round<moves.size()) {
            String move = moves.get(round);
            round = round + 1;
            return move;
        }
        return "";
    }

//    ss包含两种信息，这是第几个选项，
    public String getOption(int ss){
        if(round<moves.size()) {
            switch (moves.get(round)) {
                case "正在说服铁匠给你强化装备": {
                    Log.d("正在说服铁匠给你强化装备", "ss");
                    event = 1;
                    needChoose = true;
                    switch (ss) {
                        case 0: {
                            return "先加个1，这大概不会出什么问题吧";
                        }
                        case 1: {
                            return "我想加个2，这样我估计期望最高";
                        }
                        case 2: {
                            return "我要加5！俺寻思能成";
                        }
                    }
                }
                case "正在欣赏昂贵的装备": {
                    Log.d("正在欣赏昂贵的装备", "ss");
                    event = 2;
                    needChoose = true;
                    switch (ss) {
                        case 0: {
                            options[0] = data.getEquipment(level, Character.getJob());
                            return options[0];
                        }
                        case 1: {
                            options[1] = data.getEquipment(level, Character.getJob());
                            return options[1];
                        }
                        case 2: {
                            options[2] = "算了算了";
                            return options[2];
                        }
                    }
                }
                case "正在和查看行商的物品": {
                    Log.d("正在和查看行商的物品", "ss");

                    event = 3;
                    needChoose = true;

                    switch (ss) {
                        case 0: {
                            options[0] = data.getRandomEquipment(Character.getJob());
                            return options[0];
                        }
                        case 1: {
                            options[1] = data.getRandomEquipment(Character.getJob());
                            return options[1];
                        }
                        case 2: {
                            options[2] = "算了算了";
                            return options[2];
                        }
                    }
                }
                case "正在黑市里闲逛": {
                    Log.d("正在黑市里闲逛", "ss");

                    event = 4;
                    needChoose = true;
                    switch (ss) {
                        case 0: {
                            options[0] = data.getRandomEquipment(Character.getJob());
                            return options[0];
                        }
                        case 1: {
                            options[1] = data.getRandomEquipment(Character.getJob());
                            return options[1];
                        }
                        case 2: {
                            options[2] = "算了算了";
                            return options[2];
                        }
                    }
                }
                case "正在寻找可以完成的任务": {
                    Log.d("正在寻找可以完成的任务", "ss");
                    event = 5;
                    needChoose = true;
                    switch (ss) {
                        case 0: {
                            options[0] = data.getMission(Character.getLevel());
                            return options[0];
                        }
                        case 1: {
                            options[1] = data.getMission(Character.getLevel());
                            return options[1];
                        }
                        case 2: {
                            options[2] = data.getMission(Character.getLevel());
                            return options[2];
                        }
                    }
                }
                case "正在准备自己的装备，准备出发": {
                    Log.d("正在准备自己的装备", "准备出发");
                    event = 6;
                    needChoose = true;
                    switch (ss) {
                        case 0: {
                            places[0] = data.getAMap();
                            return "我要去" + places[0].getName()+ "继续我伟大的冒险";
                        }
                        case 1: {
                            places[1] = data.getAMap();
                            return "我要去" + places[1].getName() + "继续我伟大的冒险";
                        }
                        case 2: {
                            places[2] = data.getAMap();
                            return "我要去" + places[2].getName() + "继续我伟大的冒险";
                        }
                    }
                }
            }
        }
        return "";
    }

    public boolean isNeedChoose(){
        return needChoose;
    }
    public boolean getFree(){
        return isFree;
    }

    public void choose(int choice){
        switch (event){
            case 1: {
                switch (choice){
                    case 0:{
                       if(Character.strengthEquipment(1)){
                           moves.add(round,"成功强化,ez");
                       }else {
                           moves.add(round,"真的非啊,gg");
                       }
                        break;
                    }
                    case 1:{
                        if(Character.strengthEquipment(2)){
                            moves.add(round,"成功强化,ez");
                        }else {
                            moves.add(round,"有点非啊,gg");
                        }
                        break;
                    }
                    case 2:{
                        if(Character.strengthEquipment(5)){
                            moves.add(round,"成功强化,欧！");
                        }else {
                            moves.add(round,"你以为自己是天选之人？");
                        }
                        break;
                    }
                }
                needChoose = false;
                break;
            }
            case 2:{
                needChoose=false;
                break;

            }
            case 3:{
                needChoose=false;
                break;

            }
            case 4:{
                needChoose=false;
                break;

            }
            case 5: {
                needChoose = false;
                break;

            }
            case 6:{
                switch (choice){
                    case 0:{
                        Adventure adventure=new Adventure(places[0]);
                        Character.setNextAdventure(adventure);
                        break;
                    }
                    case 1:{
                        Adventure adventure=new Adventure(places[1]);
                        Character.setNextAdventure(adventure);
                        break;

                    }
                    case 2:{
                        Adventure adventure=new Adventure(places[2]);
                        Character.setNextAdventure(adventure);
                        break;

                    }
                }
                isFree=true;
                needChoose=false;
                break;
            }
        }
    }



}
