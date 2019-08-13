package top.lijiulong.base.lambda.lambdaTest;

/**
 * @program java
 * @description: lambda表达式做参数
 * @author: jiulong.li
 * @date: 2019/08/13 11:12
 */
public class Demo1Runnable {

    public static void startThread(Runnable run){
        new Thread(run).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->线程启动了");
            }
        });

        startThread(()->{
            System.out.println(Thread.currentThread().getName()+"-->线程启动了");
        });

        startThread(()->System.out.println(Thread.currentThread().getName()+"-->线程启动了"));
    }


}
