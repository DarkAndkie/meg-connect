package com.example.meg_connect.Repository;

import com.example.meg_connect.Entity.UserFollower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUserFollower extends JpaRepository<UserFollower,Long> {
}
