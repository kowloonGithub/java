package top.lijiulong.effectiveJava;

import java.io.Serializable;

/**
 * @program java
 * @description: 用私有构造器或枚举类型强化Singleton属性
 * @author: jiulong.li
 * @date: 2019/08/13 19:38
 */
public class Demo03 {

    public static void main(String[] args) {
        singleton3 s3 = singleton3.INSTANCE;
        s3.print10();
    }

}
//私有化构造函数来实现单例模式
class singleton1{
    private singleton1(){};
    public static final singleton1 INSTANCE = new singleton1();
}
//AccessibleObject.setAccessible方法可以通过反射机制调用私有构造器，抵御方式是在创建第二个实例的时候抛出异常
class singleton2{
    private singleton2(){};
    private static final singleton2 INSTANCE = new singleton2();
    public static singleton2 getInstance(){return INSTANCE;}

    public Object readResolve() {
        return INSTANCE;
    }
}
//单个元素枚举类型
enum singleton3{
    INSTANCE;
    public void print10(){
        System.out.println(10);
    }
}


