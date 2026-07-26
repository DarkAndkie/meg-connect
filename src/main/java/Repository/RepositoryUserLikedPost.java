package Repository;

import Entity.UserLikedPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUserLikedPost extends JpaRepository<UserLikedPost,Long> {
}
