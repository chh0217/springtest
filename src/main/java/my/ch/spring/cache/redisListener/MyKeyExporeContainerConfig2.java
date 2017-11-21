package my.ch.spring.cache.redisListener;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

/**
 * Created by chenh on 2017/10/31.
 */
@Component
public class MyKeyExporeContainerConfig2 {
    @Bean
    RedisMessageListenerContainer listenerAdapter(RedisConnectionFactory connectionFactory) {
        System.out.println("22222");
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
//        container.addMessageListener(, new ChannelTopic("__keyevent@0__:expired"));
//        new KeyExpirationEventMessageListener();
        return container;
    }
}
