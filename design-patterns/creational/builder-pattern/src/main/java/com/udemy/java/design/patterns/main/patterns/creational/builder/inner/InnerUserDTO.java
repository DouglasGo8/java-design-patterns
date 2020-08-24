package com.udemy.java.design.patterns.main.patterns.creational.builder.inner;


import com.udemy.java.design.patterns.main.patterns.creational.builder.domain.Address;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
public class InnerUserDTO {

    private String age;
    private String name;
    private String address;

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address;
    }

    public static InnerUserDTOBuilder getBuilder() {
        return new InnerUserDTOBuilder();
    }

    public static class InnerUserDTOBuilder {

        private String age;
        private String address;
        private String lastName;
        private String firstName;
        //
        private InnerUserDTO userDTO;

        public InnerUserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        //
        public InnerUserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public InnerUserDTOBuilder withBirthday(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public InnerUserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + " " + address.getStreet()
                    + "\n" + address.getCity() + ", " + address.getState() + " " + address.getZipCode();

            return this;
        }

        public InnerUserDTO build() {
            //
            this.userDTO = new InnerUserDTO(); // outer most implementation

            userDTO.setName(firstName + " " + lastName);
            userDTO.setAddress(address);
            userDTO.setAge(age);

            return this.userDTO;
        }

        public InnerUserDTO getUserDTO() {
            return this.userDTO;
        }
    }

}
