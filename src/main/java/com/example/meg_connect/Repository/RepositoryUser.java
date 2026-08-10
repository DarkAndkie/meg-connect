package com.example.meg_connect.Repository;

import com.example.meg_connect.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositoryUser extends JpaRepository<User,Long> {


    Optional<User> findByEmail(String email);

    //para solo saber si existe y no desperdiciar tiempo trayendo el objeto, me sirve mas esta wea xd
    boolean existsByEmail(String email);
}
