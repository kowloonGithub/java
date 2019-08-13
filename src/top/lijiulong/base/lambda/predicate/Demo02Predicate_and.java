package top.lijiulong.base.lambda.predicate;

import java.util.function.Predicate;

/**
 * @program java
 * @description: 连接两个判断条件
 * @author: jiulong.li
 * @date: 2019/08/13 14:22
 */
public class Demo02Predicate_and {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "abcdef";

        boolean b = checkString(s,(String str)->{return str.length()>5;},(String str)->{return str.contains("a");});
        System.out.println(b);
    }

}
