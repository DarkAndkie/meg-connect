package com.example.meg_connect.Repository;

import com.example.meg_connect.Entity.UserLikedPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUserLikedPost extends JpaRepository<UserLikedPost,Long> {
}
