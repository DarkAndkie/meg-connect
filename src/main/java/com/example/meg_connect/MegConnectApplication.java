package com.example.meg_connect;

import Repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MegConnectApplication {

    @Autowired
    private RepositoryUser repositorio_user;
    public static void main(String[] args) {
        SpringApplication.run(MegConnectApplication.class, args);
    }

}
