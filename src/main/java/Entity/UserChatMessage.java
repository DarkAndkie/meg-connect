package Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="user_chat_message")
public class UserChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="secret_message",nullable = false)
    private String message;

    @Column(name="send_date",nullable = false)
    private LocalDateTime sendDate;

    @ManyToOne
    @JoinColumn(name="remittent",nullable = false)
    private User remittent;

    @Column(name="message_cheackout",nullable = false)
    private boolean message_Checkout;

    @ManyToOne
    @JoinColumn(name="Chat_id", nullable = false)
    private UserChat chat;



}
