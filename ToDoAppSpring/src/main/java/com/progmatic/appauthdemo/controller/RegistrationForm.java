package com.progmatic.appauthdemo.controller;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationForm {


    private String firstName;
    private String lastName;

    @Size(min = 5, max = 50)
    private String email;
    @Size(min = 5, max = 50)
    private String password;
}
