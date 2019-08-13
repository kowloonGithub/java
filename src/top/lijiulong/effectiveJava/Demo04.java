package top.lijiulong.effectiveJava;

/**
 * @program java
 * @description: 私有构造器来强化不可实例化能力
 *
 * 很多工具类都不希望被实例化
 * 用抽象方法不可行，因为可以被子类实例化
 * 解决方法:显示私有构造器，为防止内部类，构造器中throw new AssertionError();
 *
 * @author: jiulong.li
 * @date: 2019/08/13 20:04
 */
public class Demo04 {

}
