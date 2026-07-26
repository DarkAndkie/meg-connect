package Dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserChatMessageDto {

    private String message;
    private LocalDateTime sendDate;
    private Long userRemittent;
    private boolean message_Checkout;
    private Long chatId;
}
