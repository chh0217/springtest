package my.ch.spring.event.hello;

import org.apache.commons.collections.MapUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by chenh on 2017/11/13.
 */
public class TestClass {
    private static  Map<String,Integer> eventMap = new HashMap();
    private void populateEventMap(){
        eventMap.put("aaa", new Random().nextInt(100));
    }
    public void ppp(){
        if(MapUtils.isEmpty(eventMap)){
            populateEventMap();
        }
        System.out.println(eventMap.get("aaa"));
    }
}
