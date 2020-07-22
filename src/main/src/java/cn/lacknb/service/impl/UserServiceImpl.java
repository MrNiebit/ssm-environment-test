package cn.lacknb.service.impl;

import cn.lacknb.dao.UserDao;
import cn.lacknb.pojo.User;
import cn.lacknb.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gitsilence
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> selectList() {
        return userDao.selectList();
    }
}
