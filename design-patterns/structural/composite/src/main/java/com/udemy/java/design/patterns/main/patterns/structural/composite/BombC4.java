package com.udemy.java.design.patterns.main.patterns.structural.composite;

public class BombC4 extends Bomb {

    private long pwt;

    public BombC4(String name, long pwt) {
        super(name);
        this.pwt = pwt;
    }

    @Override
    void whichIsBomb() {
        System.out.println(super.getName() + "\t" + this.pwt);
    }

    @Override
    void addBomb(Bomb bomb) {
        throw new UnsupportedOperationException("C4 is not more available");
    }

    @Override
    Bomb[] getBombs() {
        throw new UnsupportedOperationException("C4 is not more available");
    }

    @Override
    boolean disarmBomb() {
        throw new UnsupportedOperationException("C4 is not more available");
    }
}
