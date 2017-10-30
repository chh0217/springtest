package my.ch.spring.cache.service;

import my.ch.spring.cache.domain.User;

/**
 * Created by chenh on 2017/6/5.
 */
public interface UserService {

//    @Cacheable(value="user",key="#id")
    public User getUserById(Long id);
//    @Cacheable(value="user", key = "#user.id")
    public void save(User user);

    public void removeUserById(Long id);

}
