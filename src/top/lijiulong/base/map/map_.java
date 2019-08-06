package top.lijiulong.base.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map_ {
    public static void main(String[] args) {
        /**
         * Map:key-value
         * HashMap:底层hash表，无序集合，存储和取出元素顺序不一致
         * LinkedHashMap：底层hash表+链表是一个有序的集合
         */


        //map的遍历
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        Iterator it = map.keySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for(String key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"-"+value);
        }

        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = iterator.next();
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }

        /**
         * jdk9
         */
    }
}
