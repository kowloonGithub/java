package top.lijiulong.stream.demo02;

import java.util.stream.Stream;

/**
 * @program java
 * @description: 把流组合一下
 * @author: jiulong.li
 * @date: 2019/08/13 16:25
 */
public class Demo08Stream_concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        String[] arr = {"美羊羊","喜洋洋","懒洋洋","灰太狼","红太狼"};
        Stream<String> stream2 = Stream.of(arr);

        Stream<String> concat = Stream.concat(stream1,stream2);
        concat.forEach(name->System.out.println(name));

    }
}
