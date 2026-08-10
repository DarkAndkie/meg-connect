package com.example.meg_connect.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="user_follower")
public class UserFollower {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="followed_id",nullable = false)
    private User followed;

    @ManyToOne
    @JoinColumn(name="follower_id",nullable = false)
    private User follower;

}
