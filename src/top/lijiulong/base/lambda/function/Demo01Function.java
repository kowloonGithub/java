package top.lijiulong.base.lambda.function;

import java.util.function.Function;

/**
 * @program java
 * @description: 进行类型转换
 * @author: jiulong.li
 * @date: 2019/08/13 14:43
 */
public class Demo01Function {
    public static void change(String s, Function<String,Integer> fun){
        System.out.println(fun.apply(s));
    }


    public static void main(String[] args) {
        String s = "1234";
        change(s,str->Integer.parseInt(s));
    }
}
