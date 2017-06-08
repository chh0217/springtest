package my.ch.spring.cache;


import my.ch.spring.cache.domain.User;
import my.ch.spring.cache.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chenh on 2017/6/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class Test {
    @Autowired
    private RedisCacheManager cacheCacheManger;
    @Autowired
    private UserService userService;

    @org.junit.Test
    public void test(){
        Integer id = 1125;
        User u1 = new User(id, "1zhang");
        Integer id2 = 1126;
        User u2 = new User(id2, "2zhang");
        User u3 = new User(1127, "2zhang");


//        //根据缓存名字获取Cache
//        Cache cache = cacheCacheManger.getCache("user");
//        System.out.println("--- " + (null != cache.get(id, User.class)?cache.get(id, User.class).getName():"没有缓存"));
//        userService.save(user);
//        //往缓存写数据
//        System.out.println((null != cache.get(id, User.class)?cache.get(id, User.class).getName():"没有缓存啊"));
        //从缓存读数据
//        Assert.assertNotNull(cache.get(id, User.class));
        userService.save(u1);
        userService.save(u2);
        userService.save(u3);
        User u = userService.getUserById(id);
        System.out.println("~~~ " + u.getName());
    }
}
