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
@Table(name="post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id",nullable = false)
    private User userPost;

    @Column(name="date_upload",nullable = false)
    private LocalDateTime uploadDate;

    /*

    aqui van los song
     */

    @Column(name="content",nullable = false)
    private String content;


}
