package top.lijiulong.base.lambda.comsumer;

import java.util.function.Consumer;

/**
 * @program java
 * @description:
 * @author: jiulong.li
 * @date: 2019/08/13 14:05
 */
public class Demo01Consumer {
    public static void main(String[] args) {

        method("九龙",(String name) ->{
            String reName = new StringBuilder(name).reverse().toString();
            System.out.println(reName);
        });
    }

    public static void method(String name, Consumer<String> consumer){
        consumer.accept(name);
    }

}
