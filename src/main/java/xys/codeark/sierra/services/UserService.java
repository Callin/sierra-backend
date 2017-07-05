package xys.codeark.sierra.services;

import org.jvnet.hk2.annotations.Service;
import xys.codeark.sierra.dto.User;

public interface UserService {
    /**
     * Creates a user
     *
     * @param user DTO that stores user details
     */
    void createUser(User user);

    /**
     * Retrieves the user based on its ID
     *
     * @param id the id of the user to be retrieved
     * @return   the user mathcing the id
     */
    User getUser(Long id);
}
