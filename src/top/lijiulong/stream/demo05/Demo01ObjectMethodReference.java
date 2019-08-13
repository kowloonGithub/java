package top.lijiulong.stream.demo05;

/**
 * @program java
 * @description: 通过对象名引用成员方法
 * @author: jiulong.li
 * @date: 2019/08/13 16:51
 */
public class Demo01ObjectMethodReference {
    public static void printString(Printable p){
        p.print("Hello");
    }

    public static void main(String[] args) {
        printString(s -> {
            MethodRerObject obj = new MethodRerObject();
            obj.printUpperCaseString(s);
        });



        MethodRerObject obj1 = new MethodRerObject();
        printString(obj1::printUpperCaseString);
    }
}
