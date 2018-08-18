package com.example.cartman.faeronages.game.maps;

public abstract class Place {
    public abstract int adventureTime();
    public abstract String smallMonster();
    public abstract String environment();
    public abstract void investigate();
    public abstract boolean knowBoss();
    public abstract String battleInfo();
    public abstract String battleChoiceContent(boolean choice);
    public abstract String bossChoose(boolean choice);
    public abstract String getName();
    public abstract String toString();
}
