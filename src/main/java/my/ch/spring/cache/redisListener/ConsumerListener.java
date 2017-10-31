package my.ch.spring.cache.redisListener;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

/**
 * Created by chenh on 2017/10/31.
 */
//@Component
public class ConsumerListener implements MessageListener{
    @Override
    public void onMessage(Message message, byte[] pattern) {
        System.out.println("过期~~~~~~~~~~"+message.toString());
    }
}
