package top.lijiulong.stream.demo02;

import java.util.ArrayList;

/**
 * @program java
 * @description: count统计流中的个数
 * @author: jiulong.li
 * @date: 2019/08/13 15:42
 */
public class Demo05Stream_count {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list.stream().count());


    }
}
