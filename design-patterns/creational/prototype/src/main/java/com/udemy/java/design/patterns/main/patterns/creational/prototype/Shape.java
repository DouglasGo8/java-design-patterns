package com.udemy.java.design.patterns.main.patterns.creational.prototype;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public abstract class Shape {
  private int x;
  private int y;
  private String color;

  public Shape(Shape target) {
    if (null != target) {
      this.x = target.x;
      this.y = target.y;
      this.color = target.color;
    }
  }

  public abstract Shape clone();

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Shape shape = (Shape) o;
    return x == shape.x && y == shape.y && Objects.equals(color, shape.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, color);
  }
}
