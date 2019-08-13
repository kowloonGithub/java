package top.lijiulong.stream.demo02;

import java.util.stream.Stream;

/**
 * @program java
 * @description: 遍历流中的数据
 * @author: jiulong.li
 * @date: 2019/08/13 15:01
 */
public class Demo02ForEach {
    public static void main(String[] args) {
        Stream<String> stream =  Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.forEach(name->System.out.println(name));
    }
}
