package my.ch.spring.cache.redisListener;

import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

/**
 * Created by chenh on 2017/10/31.
 */
public class MyKeyExporeContainerConfig2 {

    RedisMessageListenerContainer listenerAdapter(RedisConnectionFactory connectionFactory) {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
//        container.addMessageListener(, new ChannelTopic("__keyevent@0__:expired"));
//        new KeyExpirationEventMessageListener();
        return container;
    }
}
