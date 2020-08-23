

package com.udemy.java.design.patterns.main.patterns.creational.builder.domain;

import com.udemy.java.design.patterns.main.patterns.creational.builder.domain.Address;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * @author dbatista
 */
@Getter
@Setter
public class User {

    private String lastName;
    private String firstName;
    //
    private LocalDate birthDay;
    private Address address;

}