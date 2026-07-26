package Repository;

import Entity.UserChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUserChatMessage extends JpaRepository<UserChatMessage,Long> {
}
