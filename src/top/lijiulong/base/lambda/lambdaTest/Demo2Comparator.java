package top.lijiulong.base.lambda.lambdaTest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program java
 * @description: 使用lambda表达式实现Comparator
 * @author: jiulong.li
 * @date: 2019/08/13 11:16
 */
public class Demo2Comparator {

    private static Comparator<String> getComparator(){
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };
    }

    private static Comparator<String> getComparator1(){
        return (o1,o2) -> o2.length() - o1.length();
    }

    public static void main(String[] args) {
        String[] arr = { "aaa",  "aaaa", "aa", "a"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getComparator1());
        System.out.println(Arrays.toString(arr));
    }
}
