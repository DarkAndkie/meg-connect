package com.example.meg_connect.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "User_meg")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_email", length = 50, nullable = false)
    private String email;
    @Column(name = "user_name", length = 50, nullable = false)
    private String username;

    @Column(name = "phone", length = 10, nullable = false)
    private String phone;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "password", length = 255, nullable = false)
    private String password;

    @OneToMany(mappedBy = "user_meg", fetch = FetchType.EAGER)
    private List<UserRole> roles;
    //Al parecer spring security tiene unos requerimientos para reconocer a la entidad usuario a modo
    //de funciones, que weba encima aun si no uso alguna debo poner todas las interfaces


    //como spring security usa esto para hacer el token, quiero es identificar a la gente
    //por su correo el username real vel un pacman :v
    @Override
    public String getUsername(){
        return this.email;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles.stream()
                .map(usuarioRol1 -> new SimpleGrantedAuthority("ROLE_" + usuarioRol1.getRole()))
                .collect(Collectors.toList());

    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}

