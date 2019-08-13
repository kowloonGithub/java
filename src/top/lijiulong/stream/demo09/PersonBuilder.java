package top.lijiulong.stream.demo09;

/**
 * @program: java
 * @description: 创建一个函数式接口
 * @author: jiulong.li
 * @date: 2019-08-13 17:59
 **/
@FunctionalInterface
public interface PersonBuilder {
    Person buildPerson(String name);
}
