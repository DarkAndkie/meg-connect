package com.example.meg_connect.Dto;


import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserRegisterDto{

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String birthDate;
    private String password;
}
