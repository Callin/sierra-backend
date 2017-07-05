package xys.codeark.sierra.dao;

import org.springframework.stereotype.Repository;
import xys.codeark.sierra.domain.User;

@Repository
public interface UserDao {
    void createUser(User user);

    User getUser(Long id);
}
