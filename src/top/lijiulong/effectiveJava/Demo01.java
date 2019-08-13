package top.lijiulong.effectiveJava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: jiulong.li
 * @Date: 2019/8/9 14:10
 */
public class Demo01 {

    /**
    *
    * @author jiulong.li
    * @Date 14:10 2019/8/9
    * @Function 考虑用静态工厂方法代替构造器
     * 1、静态工厂方法相比构造器有名称
     * 2、静态工厂方法每次调用不用创建新对象
     * 3、静态工厂方法可以返回 原返回类型的任何子类型对象
     * 4、静态工厂方法创建参数化实例的时候回让代码更加简洁
     *
     * 缺点：
     * 1、类如果不含有公有 或 受保护的构造器， 就不能被子类化
     * 2、与其他静态方法实际上没有任何区别
    * @param args
    * @return void
    */
    public static void main(String[] args) {

        System.out.println(Demo01.valueOf(1==2));

        Map<String, List<String>> m = new HashMap<String, List<String>>();
        Map<String, List<String>> mm = Demo01.newInstance();
    }

    public static Boolean valueOf(boolean b){
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    public static <K, V> HashMap<K, V> newInstance(){
        return new HashMap<K, V>();

    }
}
