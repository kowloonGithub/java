package top.lijiulong.stream.demo02;

import com.sun.javafx.collections.MappingChange;

import java.util.*;
import java.util.stream.Stream;

/**
 * @program java
 * @description: 获取流
 * @author: jiulong.li
 * @date: 2019/08/13 14:53
 */
public class Demo01GetStream {
    List<String> list = new ArrayList<>();
    Stream<String> stream1 = list.stream();

    Set<String> set = new HashSet<>();
    Stream<String> stream2 = set.stream();

    Map<String,String> map = new HashMap<>();
    Set<String> keysey = map.keySet();
    Stream<String> stream3 = keysey.stream();
    Collection<String> values = map.values();
    Stream<String> stream4 = values.stream();

    Set<Map.Entry<String,String>> entries = map.entrySet();
    Stream<Map.Entry<String,String>> stream5 =entries.stream();

    Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);


}
