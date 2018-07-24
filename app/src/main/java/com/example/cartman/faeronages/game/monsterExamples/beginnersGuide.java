package com.example.cartman.faeronages.game.monsterExamples;

public enum beginnersGuide {
    pig("小野猪","野猪牙齿",0),rabbit("","",1),slem("","",2),;
    private String name;
    private int index;
    private String material;

    // 构造方法，注意：构造方法不能为public，因为enum并不可以被实例化
    beginnersGuide(String name,String material,int index) {
        this.material=material;
        this.name = name;
        this.index = index;
    }

    // 普通方法
    public static String[] getMonsters() {
        return new String[]{};
    }


}
