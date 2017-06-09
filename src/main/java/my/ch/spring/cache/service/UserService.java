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
@Service
public class UserService {

    Set<User> users = new HashSet<>();

    @Cacheable(value="user",key="#id")
    public User getUserById(int id) {
        System.out.println("cache miss, invoke find by id, id:" + id);
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

//    @Caching(
//            put = {
//                    @CachePut(value = "user", key = "#user.id",keyGenerator = "myKeyGenerator")
//            }
//    )
    @Cacheable(value="user", key = "#user.id")
    public User save(User user) {
        users.add(user);
        return user;
    }

    @CacheEvict(value="user",key="#user.id")
    public void removeUserById(int id) {
    }

//    @Caching{
//        cacheable={@Cacheable(value="",key=""),
//        put={
//        @Cacheable(cache)
//        }
//    }
//    public List<User> findByUserName(){
//
//    }
}
