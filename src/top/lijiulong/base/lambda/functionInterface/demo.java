package top.lijiulong.base.lambda.functionInterface;

/**
 * @program java
 * @description: demo
 * @author: jiulong.li
 * @date: 2019/08/12 11:05
 */
public class demo {
    public static void show (myFunctionInterface myInter){
        myInter.methon();
    }

    public static void main(String[] args) {
        show(new myFunctionInterfaceImpl());

        show(new myFunctionInterface() {
            @Override
            public void methon() {
                System.out.println("使用匿名内部类重写接口的抽象方法");
            }
        });

        show(()->{System.out.println("使用lambda表达式重写接口抽象方法");});

        show(()->System.out.println("使用lambda表达式重写接口抽象方法"));
    }
}
