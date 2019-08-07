package top.lijiulong.base.exceptionAndThread.threadlambda;

public class lambda_ {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        }).start();

//
//        new Thread(()->{
//            System.out.println(Thread.currentThread().getName()+"新线程创建了");
//        }).start();
//
//        new Thread(()->System.out.println("")).start();
    }
}
