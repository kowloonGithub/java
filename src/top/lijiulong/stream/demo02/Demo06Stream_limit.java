package top.lijiulong.stream.demo02;

import java.util.stream.Stream;

/**
 * @program java
 * @description: 截取流中的元素
 * @author: jiulong.li
 * @date: 2019/08/13 15:46
 */
public class Demo06Stream_limit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of(new String[]{"美羊羊", "喜洋洋", "懒洋洋", "灰太狼", "红太狼"});
        Stream<String> stream2 = stream.limit(3);
        stream2.forEach(name->System.out.println(name));
    }
}
