package Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserChatMessageRegisterDto {

    private String message;
    private LocalDateTime sendDate;
    private boolean message_Checkout;
    private Long chatId;
}
