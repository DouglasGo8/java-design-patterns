package com.udemy.java.design.patterns.main.patterns.creational.prototype;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Circle extends Shape {

  private int radius;

  public Circle(Circle target) {
    super(target);
    if (null != target)
      this.radius = target.radius;
  }

  @Override
  public Shape clone() {
    return new Circle(this);
  }

  @Override
  public boolean equals(Object object2) {
    if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
    Circle circle = (Circle) object2;
    return circle.radius == radius;
  }
}
