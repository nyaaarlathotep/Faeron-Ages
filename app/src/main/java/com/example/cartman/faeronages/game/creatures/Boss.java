package com.example.cartman.faeronages.game.creatures;

public abstract class Boss {

    public abstract String track();
    public abstract String battleInfo();
    public abstract String battleChoiceContent(boolean choice);
    public abstract void beSeeked();
    public abstract boolean spotted();
    public abstract void bossChoose(boolean choice);
}
