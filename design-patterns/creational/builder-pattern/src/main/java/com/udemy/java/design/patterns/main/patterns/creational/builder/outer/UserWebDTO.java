package com.udemy.java.design.patterns.main.patterns.creational.builder.outer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserWebDTO implements OuterUserDTO {
    private String age;
    private String name;
    private String address;

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address ;
    }

}
