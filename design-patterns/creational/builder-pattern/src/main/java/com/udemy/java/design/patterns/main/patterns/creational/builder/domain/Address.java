package com.udemy.java.design.patterns.main.patterns.creational.builder.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String city;
    private String state;
    private String street;
    private String zipCode;
    private String houseNumber;
}
