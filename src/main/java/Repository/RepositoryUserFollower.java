package Repository;

import Entity.UserFollower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUserFollower extends JpaRepository<UserFollower,Long> {
}
