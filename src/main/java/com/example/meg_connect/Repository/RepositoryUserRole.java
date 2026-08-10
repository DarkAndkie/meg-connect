package com.example.meg_connect.Repository;

import com.example.meg_connect.Entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUserRole extends JpaRepository<UserRole,Long> {
}
