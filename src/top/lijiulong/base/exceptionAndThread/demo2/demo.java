package top.lijiulong.base.exceptionAndThread.demo2;

public class demo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();

        new MyThread("旺财").start();
    }
}
