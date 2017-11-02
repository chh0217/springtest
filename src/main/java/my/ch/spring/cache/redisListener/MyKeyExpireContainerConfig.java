package my.ch.spring.cache.redisListener;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

/**
 * Created by chenh on 2017/10/31.
 */
@Component
public class MyKeyExpireContainerConfig {

    @Bean
    ConsumerListener consumerListener(){
        System.out.println("监听器初始化~");
        return new ConsumerListener();
    }

    @Bean
    public RedisConnectionFactory redisConnectionFactory(){
        JedisConnectionFactory redisConnectionFactory=new JedisConnectionFactory();
        redisConnectionFactory.setHostName("127.0.0.1");
        redisConnectionFactory.setUsePool(true);
        return redisConnectionFactory;
    }

//    @Bean
//    StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
//        return new StringRedisTemplate(connectionFactory);
//    }

    @Bean
    RedisMessageListenerContainer listenerAdapter(RedisConnectionFactory connectionFactory,ConsumerListener consumerListener) {
        System.out.println("开始监听过期事件~");
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.addMessageListener(consumerListener, new ChannelTopic("__keyevent@0__:expired"));
        return container;
    }
}
