package top.lijiulong.base.lambda.predicate;

import java.util.function.Predicate;

/**
 * @program java
 * @description: 判断条件去反
 * @author: jiulong.li
 * @date: 2019/08/13 14:31
 */
public class Demo04Predicate_no {
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.negate().test(s);
    }


    public static void main(String[] args) {
        boolean b = checkString("abc",(str)->str.length()>5);
        System.out.println(b);
    }
}
