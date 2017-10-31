package my.ch.spring.cache.redisListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

/**
 * Created by chenh on 2017/10/31.
 */
@Component
public class MyKeyExpireContainerConfig {

    @Autowired
    private ConsumerListener consumerListener;

    @Bean
    RedisMessageListenerContainer  listenerAdapter(RedisConnectionFactory connectionFactory) {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.addMessageListener(consumerListener, new ChannelTopic("__keyevent@0__:expired"));
        return container;
    }
}
