package top.lijiulong.stream.demo09;

/**
 * @program java
 * @description: 类的构造器的引用
 * @author: jiulong.li
 * @date: 2019/08/13 18:01
 */
public class Demo {

    public static void printName(String name, PersonBuilder pb){
        Person person = pb.buildPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        printName("九龙李",name -> new Person(name));

        printName("李九龙", Person::new);
    }


}
