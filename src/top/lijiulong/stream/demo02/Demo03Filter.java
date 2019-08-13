package top.lijiulong.stream.demo02;

import java.util.stream.Stream;

/**
 * @program java
 * @description: 过滤流
 * @author: jiulong.li
 * @date: 2019/08/13 15:04
 */
public class Demo03Filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        Stream<String> stream_ = stream.filter(name->name.startsWith("张"));
        /**
         * stream是管道流，只能使用一次
         * 第一个流使用过一次了，就不能再使用了
         */

        stream_.forEach(name->System.out.println(name));
        stream.forEach(name->System.out.println(name));
    }
}
