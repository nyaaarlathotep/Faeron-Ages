package com.example.cartman.faeronages.game.creatures;

public abstract class Boss {
    public boolean option1;
    public boolean isOption1;
    public boolean option2;
    public boolean isOption2;

    private int health;
    public abstract String track();
    public abstract String detailInfo();
    public abstract String specialEvent();
    public abstract void investigate();
}
