package com.example.meg_connect.Repository;

import com.example.meg_connect.Entity.UserCommentPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUserCommentPost extends JpaRepository<UserCommentPost,Long> {
}
