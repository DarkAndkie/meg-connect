package Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "User_meg")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_email",length = 50,nullable = false)
    private String email;
    @Column(name = "user_name",length = 50,nullable = false )
    private String name;

    @Column(name = "phone", length = 10, nullable = false)
    private String phone;
    @Column(name="birth_date")
    private LocalDateTime birthDate;
    @Column(name="password",length = 255,nullable = false)
    private String password;

}
