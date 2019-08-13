package top.lijiulong.base.lambda.predicate;

import java.util.function.Predicate;

/**
 * @program java
 * @description: 对某种数据类型的数据进行判断，返回boolean
 * @author: jiulong.li
 * @date: 2019/08/13 14:18
 */
public class Demo01Predicate {
    public static boolean checkString(String s, Predicate<String> predicate){
        return predicate.test(s);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        boolean b = checkString(s,str->str.length()>5);
        System.out.println(b);
    }
}
