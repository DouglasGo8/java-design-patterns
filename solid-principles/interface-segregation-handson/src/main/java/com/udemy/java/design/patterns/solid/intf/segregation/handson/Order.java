package com.udemy.java.design.patterns.solid.intf.segregation.handson;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Order extends Entity {
    private double totalValue;
    private LocalDateTime orderPlacedOn;

}
