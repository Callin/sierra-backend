package xys.codeark.sierra.services;

import org.dozer.Mapper;
import org.springframework.stereotype.Service;
import xys.codeark.sierra.dao.UserDao;
import xys.codeark.sierra.dto.User;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Resource
    private Mapper mapper;

    @Override
    public void createUser(User user) {
        xys.codeark.sierra.domain.User userDomain =
                mapper.map(user, xys.codeark.sierra.domain.User.class);

        userDao.createUser(userDomain);
    }

    @Override
    public User getUser(Long id) {
        return mapper.map(userDao.getUser(id), User.class);
    }
}
