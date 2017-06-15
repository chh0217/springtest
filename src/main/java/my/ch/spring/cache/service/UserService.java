package my.ch.spring.cache.service;

import my.ch.spring.cache.domain.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by chenh on 2017/6/5.
 */
public interface UserService {


    public User getUserById(int id);

    public User save(User user);

    public void removeUserById(int id);

}
