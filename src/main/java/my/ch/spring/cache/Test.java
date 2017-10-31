package my.ch.spring.cache;


import my.ch.spring.cache.domain.Dog;
import my.ch.spring.cache.domain.User;
import my.ch.spring.cache.service.UserService;
import my.ch.spring.cache.service.impl.DogServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chenh on 2017/6/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext.xml"})
public class Test {
    //public class Test extends AbstractTransactionalJUnit4SpringContextTests{
    @Autowired
    private RedisCacheManager cacheCacheManger;
    @Autowired
    private UserService userService;
    @Autowired
    private DogServiceImpl dogServiceImpl;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private RedisConnectionFactory connectionFactory;

    @org.junit.Test
    public void test() throws InterruptedException {
        User u1 = new User(1L, "ch", "135", "西湖");
        User u2 = new User(2L, "ch1", "137", "西湖三墩");
        userService.save(u1);
        userService.save(u2);
        User u3 = userService.getUserById(1L);
        User u4 = userService.getUserById(2L);
        System.out.println("~~~ " + u3.getName());
        System.out.println("~~~ " + u4.getName());


//        redisTemplate.boundHashOps("test").put("holly111","shit");

//        BoundHashOperations hash = redisTemplate.boundHashOps("xxx");
//        hash.put("a1","a2");
//        System.out.println(hash.getExpire());
//        System.out.println(hash.expire(20L, TimeUnit.SECONDS));
//        System.out.println(hash.getExpire());
//        Thread.sleep(30000L);
//        hash.put("aaa","bbbbb");
    }

    @org.junit.Test
    public void test1() throws Exception {
        Integer id = 11;
        Dog u1 = new Dog(id, "1z");
        Integer id2 = 21;
        Dog u2 = new Dog(id2, "2z");
        Dog u3 = new Dog(31, "3z");


//        User user = new User(32L,"ch1","137","西湖三墩");
//        //根据缓存名字获取Cache
//        Cache cache = cacheCacheManger.getCache("user");
//        System.out.println("--- " + (null != cache.get(id, User.class)?cache.get(id, User.class).getName():"没有缓存"));
//        userService.save(user);
//        //往缓存写数据
//        System.out.println((null != cache.get(id, User.class)?cache.get(id, User.class).getName():"没有缓存啊"));
        //从缓存读数据
//        Assert.assertNotNull(cache.get(id, User.class));
        dogServiceImpl.save(u1);
        dogServiceImpl.save(u2);
        dogServiceImpl.save(u3);
        Dog u = dogServiceImpl.getDogById(id);
        System.out.println("~~~ " + u.getName());
        Dog u111 = dogServiceImpl.getDogById(id2);
        System.out.println("~~~ " + u111.getName());

        Thread.sleep(20000);
    }
}
