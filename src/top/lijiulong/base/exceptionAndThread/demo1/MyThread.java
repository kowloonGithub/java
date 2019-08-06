package top.lijiulong.base.exceptionAndThread.demo1;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
