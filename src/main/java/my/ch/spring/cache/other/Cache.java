package my.ch.spring.cache.other;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 基本缓存接口
 * @author linya
 * @date 2017-2-9
 */
public interface Cache<K, V> {

	/**
	 * 返回缓存对象名称
	 * @return
	 */
	String getName();

	/**
	 * 根据key获取
	 * @param key
	 * @return
	 */
	V get(K key);

	/**
	 * 批量获取缓存的key值
	 * @param keys
	 * @return
	 */
	Map<K, V> getAll(Iterable<K> keys);

	/**
	 * 存放缓存
	 * @param key
	 * @param val
	 * @return
	 */
	V put(K key, V val);

	/**
	 * 存放缓存，设置超时时间
	 * @param key
	 * @param val
	 * @param time
	 * @return
	 */
	V put(K key, V val, long time);

	/**
	 * 批量存放
	 * @param map
	 * @return
	 */
	Map<K, V> putAll(Map<K, V> map);

	/**
	 * 缓存大小
	 * @return
	 */
	long size();
	
	/**
	 * 清除指定的key缓存
	 * @param key
	 */
	void remove(K key);

	/**
	 * 清除缓存
	 */
	void clear();
	
	/**
	 * 设置过期时间
	 * @param key
	 * @param timeout
	 * @param unit
	 * @return
	 */
	Boolean expire(K key, long timeout, TimeUnit unit);
	
}
