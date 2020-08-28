package com.udemy.java.design.patterns.main.patterns.creational.prototype;

public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attack() {
        this.state = "attacking"; // change state
    }

    @Override
    public String toString() {
        return "Swordsman " + this.state + " @ " + super.getPosition();
    }

    @Override
    protected void reset() {
        this.state = "idle";
    }
}
