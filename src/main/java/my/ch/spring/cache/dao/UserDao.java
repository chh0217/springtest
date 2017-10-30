package my.ch.spring.cache.dao;

import my.ch.spring.cache.domain.User;
import org.springframework.cache.annotation.Cacheable;

/**
 * Created by chenh on 2017/6/6.
 */
public interface UserDao {
//    @Cacheable(value="user", key="#user.id")
    void insert(User user);
    void update(User user);
    @Cacheable(value="user",key="#id")
    User get(Long id);
    void deleteById(Long id);
}
