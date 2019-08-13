package top.lijiulong.stream.demo02;

import java.util.stream.Stream;

/**
 * @program java
 * @description: Stream map 用于类型转换
 * @author: jiulong.li
 * @date: 2019/08/13 15:12
 */
public class Demo04Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        Stream<Integer> stream1 = stream.map((String s) -> Integer.parseInt(s));
        stream1.forEach(name->System.out.println(name));
    }
}
