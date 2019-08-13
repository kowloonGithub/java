package top.lijiulong.stream.demo04;

/**
 * @program java
 * @description: 参数传递Printable 对字符串进行打印
 * @author: jiulong.li
 * @date: 2019/08/13 16:43
 */
public class Demo01Printable {
    public static void printString(Printable p){
        p.print("HelloWorld");
    }

    public static void main(String[] args) {
        printString(s -> System.out.println(s));

        printString(System.out::println);
    }
}
