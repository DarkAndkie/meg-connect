package Repository;

import Entity.PostImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPostImage extends JpaRepository<PostImage,Long> {
}
