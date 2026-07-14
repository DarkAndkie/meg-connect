package Repository;

import Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPost extends JpaRepository<Post,Long> {
}
