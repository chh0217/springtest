package my.ch.spring.cache.redisListener;

import redis.clients.jedis.JedisPubSub;

/**
 * Created by chenh on 2017/10/30.
 */
public class KeyExpiredListener extends JedisPubSub{
    @Override
    public void onPSubscribe(String pattern, int subscribedChannels) {
        System.out.println("onPSubscribe "
                + pattern + " " + subscribedChannels);
    }

    @Override
    public void onPMessage(String pattern, String channel, String message) {
        System.out.println("onPMessage pattern "
                + pattern + " " + channel + " " + message);
    }
}
