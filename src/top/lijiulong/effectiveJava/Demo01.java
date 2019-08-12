package top.lijiulong.effectiveJava;

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
    * @param args
    * @return void
    */
    public static void main(String[] args) {
        System.out.println(Demo01.valueOf(1==2));
    }

    public static Boolean valueOf(boolean b){
        return b ? Boolean.TRUE : Boolean.FALSE;
    }






}
