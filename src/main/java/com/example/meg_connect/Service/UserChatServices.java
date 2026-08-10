package com.example.meg_connect.Service;


import com.example.meg_connect.Repository.RepositoryUserChat;
import com.example.meg_connect.Repository.RepositoryUserChatMessage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserChatServices {

    private final RepositoryUserChat chatRepository;
    private final RepositoryUserChatMessage messageRepository;



}

