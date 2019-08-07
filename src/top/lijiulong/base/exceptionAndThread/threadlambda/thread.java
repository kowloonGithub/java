package top.lijiulong.base.exceptionAndThread.threadlambda;

public class thread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新线程创建了");
    }
}
