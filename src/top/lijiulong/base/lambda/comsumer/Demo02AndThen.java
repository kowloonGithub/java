package top.lijiulong.base.lambda.comsumer;

import java.util.function.Consumer;

/**
 * @program java
 * @description: 组合两个Consumer进行消费
 * @author: jiulong.li
 * @date: 2019/08/13 14:11
 */
public class Demo02AndThen {
    public static void main(String[] args) {
        method("hello",(t)->System.out.println(t.toUpperCase()),(t)->System.out.println(t.toLowerCase()));
    }

    public static void method(String s, Consumer<String> consumer1, Consumer<String > consumer2){
        consumer1.andThen(consumer2).accept(s);
    }
}
