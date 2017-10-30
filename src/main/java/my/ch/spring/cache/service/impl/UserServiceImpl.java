package my.ch.spring.cache.service.impl;

import my.ch.spring.cache.dao.UserDao;
import my.ch.spring.cache.domain.User;
import my.ch.spring.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by chenh on 2017/6/15.
 */
@Service
public class UserServiceImpl implements UserService{
    Set<User> users = new HashSet<>();

    @Autowired
    public UserDao userDao;

    @Override
    public User getUserById(Long id) {
        return userDao.get(id);
    }

    @Override
    public void save(User user) {
        userDao.insert(user);
    }

    @Override
    public void removeUserById(Long id) {
        int a = 0/0;
        userDao.deleteById(id);
    }


//    public User getUserById(int id) {
//        System.out.println("cache miss, invoke find by id, id:" + id);
//        for (User user : users) {
//            if (user.getId().equals(id)) {
//                return user;
//            }
//        }
//        return null;
//    }
//
//    public User save(User user) {
//        users.add(user);
//        return user;
//    }
//
//    @CacheEvict(value="user",key="#user.id")
//    public void removeUserById(int id) {
//    }

}
