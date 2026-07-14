package Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="user_customization")
public class UserCustomization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name="user_id",nullable = false)
    private User usuario;

    @Column(name="src_profile_photo",length = 255,nullable = false)
    private String src_profile;

    @Column(name="biography",nullable = false)
    private String biography;

    @Column(name="src_background_header_src",length = 255, nullable = false)
    private String background_header;

    @Column(name="src_background_body",length = 255,nullable = false)
    private String background_body;
}
