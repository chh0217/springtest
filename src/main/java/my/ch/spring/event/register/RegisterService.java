/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package my.ch.spring.event.register;

import my.ch.spring.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-7-8 下午9:34
 * <p>Version: 1.0
 */
@Service
public class RegisterService {

    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private UserService userService;

    public void register(String username, String password) {
        System.out.println(username + "注册成功！");
        my.ch.spring.cache.domain.User u = new my.ch.spring.cache.domain.User();
        u.setId(333L);
        u.setMobile("138");
        u.setName("啊啊啊");
        userService.save(u);


//        userService.removeUserById(333L);

//        my.ch.spring.cache.domain.User u1 = new my.ch.spring.cache.domain.User();
//        u.setId(993L);
//        u.setMobile("139");
//        u.setName("啊啊啊");
//        userService.save(u1);
        publishRegisterEvent(new User(username, password));
    }

    private void publishRegisterEvent(User user) {
        applicationContext.publishEvent(new RegisterEvent(user));
    }


}
