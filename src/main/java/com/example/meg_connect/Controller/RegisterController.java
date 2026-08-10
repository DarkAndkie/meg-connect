package com.example.meg_connect.Controller;


import com.example.meg_connect.Dto.UserRegisterDto;
import com.example.meg_connect.Dto.UserResponseDto;
import com.example.meg_connect.Service.RegisterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class RegisterController {

    private final RegisterService registerServices;


    @PostMapping("/register")
    public ResponseEntity<UserResponseDto>registrar(@RequestBody @Valid UserRegisterDto dto){
        UserResponseDto userCreated = registerServices.userRegister(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }

}
