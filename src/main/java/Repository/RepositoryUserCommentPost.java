package Repository;

import Entity.UserCommentPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUserCommentPost extends JpaRepository<UserCommentPost,Long> {
}
