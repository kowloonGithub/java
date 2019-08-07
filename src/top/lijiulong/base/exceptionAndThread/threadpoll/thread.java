package top.lijiulong.base.exceptionAndThread.threadpoll;

public class thread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建一个新的线程执行");
    }
}
