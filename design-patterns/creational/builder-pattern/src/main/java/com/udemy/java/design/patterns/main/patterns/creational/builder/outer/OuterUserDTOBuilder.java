package com.udemy.java.design.patterns.main.patterns.creational.builder.outer;

import com.udemy.java.design.patterns.main.patterns.creational.builder.domain.Address;

import java.time.LocalDate;

public interface OuterUserDTOBuilder {

    OuterUserDTOBuilder withLastName(String lastName);
    OuterUserDTOBuilder withFirstName(String firstName);
    OuterUserDTOBuilder withBirthDay(LocalDate birthDay);
    OuterUserDTOBuilder withAddress(Address address);
    //
    OuterUserDTO build();
    OuterUserDTO getOuterUserDTO();


}
