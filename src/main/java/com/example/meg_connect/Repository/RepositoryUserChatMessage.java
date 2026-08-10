package com.example.meg_connect.Repository;

import com.example.meg_connect.Entity.UserChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUserChatMessage extends JpaRepository<UserChatMessage,Long> {
}
