package my.ch.spring.cache.redisListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.core.RedisKeyExpiredEvent;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

/**
 * Created by chenh on 2017/10/31.
 */
//@Component
public class MyKeyListener extends KeyExpirationEventMessageListener {

    @Autowired
    public MyKeyListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }

    @Override
    protected void doHandleMessage(Message message) {
        publishEvent(new RedisKeyExpiredEvent(message.getBody()));
        System.out.println("adshfjshkldfj   "+message.toString());
    }
}
