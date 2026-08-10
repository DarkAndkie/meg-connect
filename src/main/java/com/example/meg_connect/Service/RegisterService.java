package com.example.meg_connect.Service;


import com.example.meg_connect.Dto.UserRegisterDto;
import com.example.meg_connect.Dto.UserResponseDto;
import com.example.meg_connect.Entity.User;
import com.example.meg_connect.Exceptions.UserException;
import com.example.meg_connect.Repository.RepositoryUser;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class RegisterService {

    private final RepositoryUser userRepository;
    private final SecurityConfiguration passwordEncoder;


    //Revisar que exista el id


    @Transactional
    public UserResponseDto userRegister(UserRegisterDto dto) {

        if (userRepository.existsByEmail(dto.getEmail())) {
            throw new UserException("Ya existe un usuario registrado con ese email");
        }

        User userToRegister = new User();
        userToRegister.setBirthDate(LocalDate.parse(dto.getBirthDate()));
        userToRegister.setUsername(dto.getName());
        userToRegister.setPhone(dto.getPhone());
        userToRegister.setEmail(dto.getEmail());
        userToRegister.setPassword(passwordEncoder.passwordEncoder().encode(dto.getPassword()));

        userRepository.save(userToRegister);

        return new UserResponseDto(userToRegister.getUsername(), userToRegister.getEmail(), userToRegister.getPhone(), userToRegister.getBirthDate());
    }

}
