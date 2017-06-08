package my.ch.spring.cache.other;

import org.springframework.data.redis.core.BoundZSetOperations;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Redis SortedSet(有序集合)操作
 * @author linya
 * @date 2017-2-10
 * @param <K>
 * @param <V>
 */
public class ZSetOperations<K, V> {

	private BoundZSetOperations<String, V> operations;
	
	public ZSetOperations(String key, RedisTemplate<String, V> redisTemplate) {
		this.operations = redisTemplate.boundZSetOps(key);
	}
	
	public ZSetOperations<K, V> zAdd(V member, double score){
		operations.add(member, score);
		return this;
	}
	
	public long count(int minScore, int maxScore){
		Long count = operations.count(minScore, maxScore);
		return count == null ? 0 : count;
	}
	
	public long size(){
		Long size = operations.size();
		return size == null ? 0 : size;
	}
	
}
