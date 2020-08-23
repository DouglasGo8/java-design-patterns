package com.udemy.java.design.patterns.main.patterns.creational.builder.inner;

import com.udemy.java.design.patterns.main.patterns.creational.builder.App;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserWebDTO implements App.UserDTO {
    private String age;
    private String name;
    private String address;

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address ;
    }

}
