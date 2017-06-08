package my.ch.spring.cache.other;

import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Redis Hash(哈希表)操作
 * @author linya
 * @date 2017-2-10
 * @param <K>
 * @param <V>
 */
public class HashOperations<K, V> {

	private BoundHashOperations<String, K, V> operations;
	
	private String name;
	
	private RedisTemplate<String, V> redisTemplate;
	
	private long expire;
	
	private TimeUnit unit;
	
	public HashOperations(String name, RedisTemplate<String, V> redisTemplate, long expire, TimeUnit unit){
		this.operations = redisTemplate.boundHashOps(name);
		this.name = name;
		this.redisTemplate = redisTemplate;
		
		this.expire = expire;
		this.unit = unit;
	}
	
	public Long hDel(Object...keys){
		return operations.delete(keys);
	}
	
	public boolean hExists(K key){
		Boolean has = operations.hasKey(key);
		return has == null ? false : has;
	}
	
	public HashOperations<K, V> hSet(Map<K, V> vlues){
		operations.putAll(vlues);
		expire();
		return this;
	}
	
	public HashOperations<K, V> hSet(K key, V value){
		operations.put(key, value);
		expire();
		return this;
	}

	public HashOperations<K, V> hSet(K key, V value, long expire, TimeUnit unit){
		operations.put(key, value);
		expire();
		return this;
	}
	
	private void expire(){
		if(unit != null){
			redisTemplate.expire(name, expire, unit);
		}
	}
	
	public V hGet(K key){
		return operations.get(key);
	}
	
	public Map<K, V> hGet(){
		return operations.entries();
	}
	
	public Set<K> hKeys(){
		return operations.keys();
	}
	
	public List<V> hVals(){
		return operations.values();
	}
	
	public long size(){
		Long size = operations.size();
		return size == null ? 0 : size;
	}
	
	public void clear(){
		redisTemplate.delete(name);
	}
	
}
