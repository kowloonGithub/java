package top.lijiulong.base.exceptionAndThread.threadlambda;

public class demo1 {
    public static void main(String[] args) {

        thread t = new thread();
        Thread tt = new Thread(t);
        tt.start();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        };
        new Thread(r).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        }).start();


    }
}
