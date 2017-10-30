package my.ch.spring.cache.service.impl;

import my.ch.spring.cache.domain.Dog;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by chenh on 2017/6/16.
 */
@Service
public class DogServiceImpl {
    Set<Dog> dogs = new HashSet<>();
    @Cacheable(value="dog",key="#id")
    public Dog getDogById(int id) {
        System.out.println("cache miss, invoke find by id, id:" + id);
        for (Dog user : dogs) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

//    @Cacheable(value="",key="#d.id")
//    public Dog getDogById(Dog d) {
//        System.out.println("cache miss, invoke find by id, id:" + d.getId());
//        for (Dog user : dogs) {
//            if (user.getId().equals(d.getId())) {
//                return user;
//            }
//        }
//        return null;
//    }

    public Dog save(Dog user) {
        dogs.add(user);
        return user;
    }

//    @CacheEvict(value="user",key="#user.id")
//    public void removeUserById(int id) {
//    }
}
