package my.ch.jdktest.collection;

/**
 * @author chenhang
 * @date 2018-03-15.
 */
public class HashMapTest {
    public static void main(String[] args) {
        System.out.println(hash("hollischuang"));
        System.out.println(hash2("hollischuang"));
    }

    final static int hash(Object k) {
        int h = 0;

        h ^= k.hashCode();

        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
    final static int hash2(Object k) {
        return k.hashCode();
    }
}
