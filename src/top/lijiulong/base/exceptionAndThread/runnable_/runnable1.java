package top.lijiulong.base.exceptionAndThread.runnable_;

public class runnable1 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 20; i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
