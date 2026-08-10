package com.example.meg_connect.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRegisterDto{

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String birthDate;
    private String password;
}
