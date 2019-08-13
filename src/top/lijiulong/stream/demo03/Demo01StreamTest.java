package top.lijiulong.stream.demo03;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @program java
 * @description:
 * @author: jiulong.li
 * @date: 2019/08/13 16:32
 */
public class Demo01StreamTest {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        Stream<String> oneStream = one.stream().filter(name -> name.length() == 3).limit(3);


        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");
        Stream<String> twoStream = two.stream().filter(name -> name.startsWith("张")).skip(2);
        Stream.concat(oneStream,twoStream).map(name->new Person(name)).forEach(p->System.out.println(p));
    }
}
