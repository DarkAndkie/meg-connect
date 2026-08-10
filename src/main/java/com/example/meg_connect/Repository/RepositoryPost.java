package com.example.meg_connect.Repository;

import com.example.meg_connect.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPost extends JpaRepository<Post,Long> {
}
