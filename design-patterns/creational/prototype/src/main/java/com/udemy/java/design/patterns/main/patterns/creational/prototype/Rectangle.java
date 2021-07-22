package com.udemy.java.design.patterns.main.patterns.creational.prototype;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Rectangle extends Shape {

  private int width;
  private int height;

  public Rectangle(Rectangle target) {
    super(target);
    if (null != target) {
      this.width = target.width;
      this.height = target.height;
    }

  }

  @Override
  public Shape clone() {
    return new Rectangle(this);
  }

  @Override
  public boolean equals(Object object2) {
    if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
    Rectangle shape2 = (Rectangle) object2;
    return shape2.width == width && shape2.height == height;
  }
}
