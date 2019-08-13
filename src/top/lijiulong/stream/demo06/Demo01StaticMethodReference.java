package top.lijiulong.stream.demo06;

/**
 * @program java
 * @description: 类名直接引用静态方法
 * @author: jiulong.li
 * @date: 2019/08/13 16:57
 */
public class Demo01StaticMethodReference {
    public static int method(int number, Calcable c){
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        int number = method(-10, n-> Math.abs(n));

        int number2 = method(-10,Math::abs);
        System.out.println(number+number2);
    }
}
