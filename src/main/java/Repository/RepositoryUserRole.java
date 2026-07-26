package Repository;

import Entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUserRole extends JpaRepository<UserRole,Long> {
}
