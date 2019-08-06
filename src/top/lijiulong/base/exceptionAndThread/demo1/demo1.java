package top.lijiulong.base.exceptionAndThread.demo1;

public class demo1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        new MyThread().start();
        new MyThread().start();

        System.out.println(Thread.currentThread().getName());
    }
}
