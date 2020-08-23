package com.udemy.java.design.patterns.main.patterns.creational.builder.inner;

import com.udemy.java.design.patterns.main.patterns.creational.builder.App;
import com.udemy.java.design.patterns.main.patterns.creational.builder.domain.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {

    private String age;
    private String lastName;
    private String firstName;

    private String address;

    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDay(LocalDate birthDay) {
        final Period ageInYears = Period.between(birthDay, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet() + ", " + "\n" + address.getCity()
                + "\n" + address.getState() + address.getZipCode();
        return this;
    }

    @Override
    public App.UserDTO build() {
        dto = new UserWebDTO(this.firstName + " " + this.lastName, this.address, this.age);
        return dto;
    }

    @Override
    public App.UserDTO getUserDTO() {
        return dto;
    }
}
