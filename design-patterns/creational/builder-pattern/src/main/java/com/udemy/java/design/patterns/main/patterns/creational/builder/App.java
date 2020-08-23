
package com.udemy.java.design.patterns.main.patterns.creational.builder;


import com.udemy.java.design.patterns.main.patterns.creational.builder.domain.Address;
import com.udemy.java.design.patterns.main.patterns.creational.builder.domain.User;
import com.udemy.java.design.patterns.main.patterns.creational.builder.inner.UserDTOBuilder;
import com.udemy.java.design.patterns.main.patterns.creational.builder.inner.UserWebDTOBuilder;

import java.time.LocalDate;

import static java.lang.System.out;

public class App {

    public static void main(String[] args) {
        var user = createUser();
        var builder = new UserWebDTOBuilder();
        //
        var dto = directBuild(builder, user);
        //
        out.println(dto);
    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user) {

        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthDay(user.getBirthDay()).build();
    }

    public static User createUser() {

        var user = new User();
        var address = new Address();
        user.setBirthDay(LocalDate.of(1980, 5, 12));
        user.setFirstName("Douglas");
        user.setLastName("Batista");
        //
        address.setHouseNumber("1005");
        address.setStreet("Wingtips Street");
        address.setState("Berlin");
        address.setCity("KreuzBerg");
        address.setZipCode("RB9921");
        //
        user.setAddress(address);


        return user;
    }

    public static interface UserDTO {

        String getName();

        String getAddress();

        String getAge();
    }
}