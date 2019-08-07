package top.lijiulong.base.exceptionAndThread.threadsafe;

public class demo {
    public static void main(String[] args) {
        runnableticket r = new runnableticket();

        Thread t0 = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t0.start();
        t1.start();
        t2.start();
    }

}
