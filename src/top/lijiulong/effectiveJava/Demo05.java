package top.lijiulong.effectiveJava;

/**
 * @program java
 * @description: 避免创建不必要的对象
 * @author: jiulong.li
 * @date: 2019/08/13 20:12
 */
public class Demo05 {

    String s = new String("String");
    String ss = "String";

    //静态工厂方法优先于构造器，避免创建不必要的对象

   //重用已知不会被修改的对象，例如Date，可以用static代码块包裹



}
