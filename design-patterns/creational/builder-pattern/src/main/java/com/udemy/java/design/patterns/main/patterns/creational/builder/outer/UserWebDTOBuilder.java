package com.udemy.java.design.patterns.main.patterns.creational.builder.outer;

import com.udemy.java.design.patterns.main.patterns.creational.builder.domain.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements OuterUserDTOBuilder {

    private String age;
    private String lastName;
    private String firstName;

    private String address;

    private UserWebDTO dto;

    @Override
    public OuterUserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public OuterUserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public OuterUserDTOBuilder withBirthDay(LocalDate birthDay) {
        final Period ageInYears = Period.between(birthDay, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public OuterUserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet() + ", " + "\n" + address.getCity()
                + "\n" + address.getState() + address.getZipCode();
        return this;
    }

    @Override
    public OuterUserDTO build() {
        dto = new UserWebDTO(this.age, this.firstName + " " + this.lastName, this.address);
        return dto;
    }

    @Override
    public OuterUserDTO getOuterUserDTO() {
        return dto;
    }
}
