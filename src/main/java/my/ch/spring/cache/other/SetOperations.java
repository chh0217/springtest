package my.ch.spring.cache.other;

import org.springframework.data.redis.core.BoundSetOperations;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Redis Set(集合)操作
 * @author linya
 * @date 2017-2-10
 * @param <V>
 */
public class SetOperations<V> {

	private BoundSetOperations<String, V> operations;
	
	public SetOperations(String key, RedisTemplate<String, V> redisTemplate){
		this.operations = redisTemplate.boundSetOps(key);
	}
	
	@SuppressWarnings("unchecked")
	public void sAdd(V...values){
		operations.add(values);
	}
	
	public void size(){
		operations.size();
	}
}
