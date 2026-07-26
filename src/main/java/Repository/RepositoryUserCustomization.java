package Repository;

import Entity.UserCustomization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUserCustomization extends JpaRepository<UserCustomization,Long> {
}
