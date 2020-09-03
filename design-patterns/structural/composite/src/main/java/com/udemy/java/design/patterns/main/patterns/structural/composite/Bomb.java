package com.udemy.java.design.patterns.main.patterns.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Bomb {

    private final String name;

    abstract void whichIsBomb();
    abstract void addBomb(Bomb bomb);
    abstract Bomb[] getBombs();
    abstract boolean disarmBomb();
}
