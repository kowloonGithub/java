package top.lijiulong.stream.demo02;

import java.util.stream.Stream;

/**
 * @program java
 * @description: 跳过元素截取
 * @author: jiulong.li
 * @date: 2019/08/13 16:20
 */
public class Demo07Stream_skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("美羊羊", "喜洋洋", "懒洋洋", "灰太狼", "红太狼");
        Stream<String> stream2 = stream.skip(3);
        stream2.forEach(System.out::println);
    }
}
