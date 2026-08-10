package com.example.meg_connect.Repository;

import com.example.meg_connect.Entity.UserChat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUserChat extends JpaRepository<UserChat,Long> {
}
