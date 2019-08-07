package top.lijiulong.base.exceptionAndThread.waitandnotify;

/**
 * wait()  当前线程等待
 * notify() 唤醒此对象监听器上等待的单个线程，继续执行wait方法后的代码
 *
 * 案例：线程间通信
 * 创建消费者，告知老板要的包子种类数量，
 * 创建生产者，5s做包子，然后告诉顾客吃包子
 *
 * attention：两线程要用同步代码块包起来，同步锁对象要唯一，锁对象才能调wait和notify
 *
 */
public class demo1 {
    public static void main(String[] args) {

        final Object obj = new Object();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("告诉老板要的包子的种类和数量");
                    }

                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("包子已经完成！");
                    System.out.println("---------------------------------------");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("花费5s 做包子");
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
