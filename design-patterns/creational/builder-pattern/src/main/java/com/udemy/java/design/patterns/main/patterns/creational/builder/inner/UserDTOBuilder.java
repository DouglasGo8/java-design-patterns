package com.udemy.java.design.patterns.main.patterns.creational.builder.inner;

import com.udemy.java.design.patterns.main.patterns.creational.builder.App;
import com.udemy.java.design.patterns.main.patterns.creational.builder.domain.Address;

import java.time.LocalDate;

public interface UserDTOBuilder {

    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withBirthDay(LocalDate birthDay);
    UserDTOBuilder withAddress(Address address);
    //
    App.UserDTO build();
    App.UserDTO getUserDTO();


}
