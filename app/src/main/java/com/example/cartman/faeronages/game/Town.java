package com.example.cartman.faeronages.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Town {
    private Random random=new Random();
    private int level;
    private int round=0;
    private ArrayList<String> moves;
    private String[] townEvents=new String[]{"啤酒节！\n是时候放开肚皮喝了，今天的酒水统统不要钱","黑死病\n整个个城镇的居民都缩在自己的家中瑟瑟发抖",
            "巧遇行商\n你正好遇到了在这座城镇歇脚的行商，他可能有很多好东西","工会解放\n这座城镇的工会负责人死了！全体工会员工都在庆祝","船新的铁匠\n年轻的学徒自立门户，他会给所有顾客一点优惠",
            "巧遇严打\n镇上来了一伙圣骑士，动不动就给路人上侦测阵营","痔疮犯了\n这下可没有你最喜欢的窑子环节了"};
    public Town(int aLevel) {
        level = aLevel;
        moves=new ArrayList<>();
        moves.addAll(Arrays.asList("正在和贪婪的材料商讨价还价","正在","","","",""));
    }

    public String getTownEvent(){
        if(random.nextBoolean()){
            return townEvents[random.nextInt(townEvents.length)];
        }
        return "又是平常的一天，平凡的小镇在它的秩序下运转着";
    }

    public String getMove(){
        return "";
    }
}
