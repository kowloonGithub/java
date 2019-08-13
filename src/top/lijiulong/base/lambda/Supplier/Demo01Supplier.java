package top.lijiulong.base.lambda.Supplier;

import java.util.function.Supplier;

/**
 * @program java
 * @description: 生产型接口
 * @author: jiulong.li
 * @date: 2019/08/13 13:25
 */
public class Demo01Supplier {

    public static String getString(Supplier<String> sup){
        return sup.get();
    }


    public static void main(String[] args) {
        String s = getString(()->{
            return "九龙";
        });

        String ss = getString(()->"九龙");
        System.out.println(s);
        System.out.println(ss);
    }
}
