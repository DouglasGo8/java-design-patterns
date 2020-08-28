package com.udemy.java.design.patterns.main.patterns.creational.prototype;

import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        position = Point3D.ZERO;
    }

    public GameUnit(float x, float y, float z) {
        position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return this.position;
    }

    protected void initialize() {
        this.position = Point3D.ZERO;
        this.reset();
    }

    protected abstract void reset();

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit gameUnit = (GameUnit) super.clone(); // swallow copy
        gameUnit.initialize(); // reset
        //
        return gameUnit;
    }
}
