package my.ch.codetest;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * @author chenhang
 * @date 2018/1/24.
 */
public class CodeTest {
    public static void main(String[] args) {
        int a = 20000000;
        Set<String> set = new HashSet<>(a);
         for (int i=0;i < a;i++){
//             System.out.println();
             set.add(UUID.randomUUID().toString().split("-")[4]);
             if(i % 1000000 == 0){
                 System.out.println(i);
             }
         }
        System.out.println(a == set.size());
        System.out.println(set.size());
    }

//    public static void main(String[] args) {
//        int a = 20000000;
//        Set<String> set = new HashSet<>(a);
//         for (int i=0;i < a;i++){
////             System.out.println();
//             set.add(getOrderIdByUUId());
//             if(i % 1000000 == 0){
//                 System.out.println(i);
//             }
//         }
//        System.out.println(a == set.size());
//        System.out.println(set.size());
//    }

//    public static String getOrderIdByUUId() {
//        int first = new Random(10).nextInt(8) + 1;
////        System.out.println(first);
//        int hashCodeV = UUID.randomUUID().toString().hashCode();
//        if (hashCodeV < 0) {//有可能是负数
//            hashCodeV = -hashCodeV;
//        }
//        // 0 代表前面补充0
//        // 4 代表长度为4
//        // d 代表参数为正数型
//        return first + String.format("%015d", hashCodeV);
//    }
}
