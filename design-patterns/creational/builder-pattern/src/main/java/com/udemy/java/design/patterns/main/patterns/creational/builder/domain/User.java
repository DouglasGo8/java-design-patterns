

package com.udemy.java.design.patterns.main.patterns.creational.builder.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * @author dbatista
 */
@Getter
@Setter
public class User {

    @NotBlank(message = "Name cannot be blank")
    private String lastName;
    private String firstName;
    //
    private LocalDate birthDay;
    private Address address;

}