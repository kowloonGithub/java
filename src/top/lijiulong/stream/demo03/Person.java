package top.lijiulong.stream.demo03;

/**
 * @program java
 * @description:
 * @author: jiulong.li
 * @date: 2019/08/13 16:30
 */
public class Person {
    private String name;

    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
