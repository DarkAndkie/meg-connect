package com.example.meg_connect.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Table(name = "User_rol")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="User_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name="role_id",nullable = false)
    private Role role;

    @Column(name="Asignation_Date",nullable = false)
    private LocalDateTime asignation_time;

    @ManyToOne
    @JoinColumn(name="AsignedBy",nullable = true)
    private User asignedby;
}
