package Repository;

import Entity.UserBlocked;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUserBlocked extends JpaRepository<UserBlocked,Long> {
}
