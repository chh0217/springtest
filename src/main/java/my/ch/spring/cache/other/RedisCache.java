package my.ch.spring.cache.other;

import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Redis缓存对象
 * @author linya
 * @date 2017-2-9
 * @param <K>
 * @param <V>
 */
public class RedisCache<K, V>  {
	
//	public static final long DEFAULT_EXPIRE = 30;
//
//	public static final TimeUnit DEFAULT_TIMEUNIT = TimeUnit.MINUTES;
//
//	/**
//	 * 缓存对象名称
//	 */
//	private String name;
//
//	/**
//	 * Redis模版对象
//	 */
//	private RedisTemplate<String, V> redisTemplate;
//
//	public RedisCache(String name, RedisTemplate<String, V> redisTemplate) {
//		this.name = name;
//		this.redisTemplate = redisTemplate;
//	}
//
//	@Override
//	public String getName() {
//		return name;
//	}
//
//	@Override
//	public V get(K key) {
//		BoundValueOperations<String, V> boundValueOperations = redisTemplate.boundValueOps(wrapKey(key));
//		return boundValueOperations.get();
//	}
//
//	@Override
//	public Map<K, V> getAll(Iterable<K> keys) {
//		Map<K, V> map = new HashMap<K, V>();
//		for (K k : keys) {
//			map.put(k, get(k));
//		}
//		return map;
//	}
//
//	@Override
//	public V put(K key, V val) {
//		BoundValueOperations<String, V> boundValueOperations = redisTemplate.boundValueOps(wrapKey(key));
//		boundValueOperations.set(val);
//		return val;
//	}
//
//	@Override
//	public Map<K, V> putAll(Map<K, V> map) {
//		for (Entry<K, V> entry : map.entrySet()) {
//			put(entry.getKey(), entry.getValue());
//		}
//		return map;
//	}
//
//	@Override
//	public long size() {
//		Set<String> keys = redisTemplate.keys(wildCard());
//		return keys.size();
//	}
//
//	@Override
//	public void clear() {
//		Set<String> keys = redisTemplate.keys(wildCard());
//		redisTemplate.delete(keys);
//	}
//
//	@Override
//	public void remove(K key) {
//		redisTemplate.delete(wrapKey(key));
//	}
//
//	@Override
//	public V put(K key, V val , long time){
//		BoundValueOperations<String, V> boundValueOperations = redisTemplate.boundValueOps(wrapKey(key));
//		boundValueOperations.set(val,time, TimeUnit.MINUTES);
//		return val;
//	}
//
//	@Override
//	public Boolean expire(K key, long timeout, TimeUnit unit) {
//		BoundValueOperations<String, V> boundValueOperations = redisTemplate.boundValueOps(wrapKey(key));
//		return boundValueOperations.expire(timeout, unit);
//	}
//
//	public Long incr(K key, long delta) {
//		BoundValueOperations<String, V> boundValueOperations = redisTemplate.boundValueOps(wrapKey(key));
//		return boundValueOperations.increment(delta);
//	}
//
//	public HashOperations<K, V> boundHashOps(String key){
//		return boundHashOps(key, DEFAULT_EXPIRE, DEFAULT_TIMEUNIT);
//	}
//
//	public HashOperations<K, V> boundHashOps(String key, long expire, TimeUnit unit){
//		key = getName() + ":" + key;
//		return new HashOperations<K, V>(key, redisTemplate, expire, unit);
//	}
//
//	public ZSetOperations<String, V> boundZSetOps(K key){
//		return new ZSetOperations<String, V>(wrapKey(key), redisTemplate);
//	}
//
//	private String wrapKey(K key){
//		return String.format("%s:%s",getName(), String.valueOf(key));
//	}
//
//	private String wildCard(){
//		return getName() + "*";
//	}
	
}
