
package com.udemy.java.design.patterns.solid.liskov.substitution;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rectangle implements Shape {

    private int width, height;

    public int computeArea() {
        return this.width * this.height;
    }
}