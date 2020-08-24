
package com.udemy.java.design.patterns.main.patterns.creational.builder;


import com.udemy.java.design.patterns.main.patterns.creational.builder.domain.Address;
import com.udemy.java.design.patterns.main.patterns.creational.builder.domain.User;
import com.udemy.java.design.patterns.main.patterns.creational.builder.inner.InnerUserDTO;
import com.udemy.java.design.patterns.main.patterns.creational.builder.outer.OuterUserDTO;
import com.udemy.java.design.patterns.main.patterns.creational.builder.outer.OuterUserDTOBuilder;
import com.udemy.java.design.patterns.main.patterns.creational.builder.outer.UserWebDTOBuilder;

import java.time.LocalDate;

import static java.lang.System.out;

public class App {

    public static void main(String[] args) {
        
        var user = createUser();
        var builder = new UserWebDTOBuilder();
        //
        var outer_dto = directOuterBuild(builder, user);
        var inner_dto = directInnerBuild(InnerUserDTO.getBuilder(), user);
        //
        out.println(outer_dto);
        //out.println(inner_dto);
    }

    // Outer
    private static OuterUserDTO directOuterBuild(OuterUserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthDay(user.getBirthDay()).build();
    }

    // Inner
    private static InnerUserDTO directInnerBuild(InnerUserDTO.InnerUserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withBirthday(user.getBirthDay()).withAddress(user.getAddress()).build();
    }

    public static User createUser() {

        var user = new User();
        var address = new Address();
        user.setBirthDay(LocalDate.of(1980, 5, 12));
        user.setFirstName("Douglas");
        //user.setLastName("Batista");
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

}