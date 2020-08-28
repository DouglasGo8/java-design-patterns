package com.udemy.java.design.patterns.main.patterns.creational.prototype;

public class General extends GameUnit {

    private String state = "idle";

    public void boostMorale() {
        this.state = "MoralBost";
    }

    @Override
    public String toString() {
        return "General " + this.state + " @ " + super.getPosition();
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }
}
