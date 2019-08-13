package top.lijiulong.base.lambda.predicate;

import java.util.function.Predicate;

/**
 * @program java
 * @description: 满足一个条件即可
 * @author: jiulong.li
 * @date: 2019/08/13 14:27
 */
public class Demo03Predicate_or {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
        return pre1.or(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "bc";
        boolean b = checkString(s,(str)->str.length()>5,(str)->str.contains("a"));
        System.out.println(b);
    }
}
