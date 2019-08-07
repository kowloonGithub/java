package top.lijiulong.base.exceptionAndThread.threadsafe3;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Lock锁买票
 *
 * 1、成员位置创建ReentrantLock对象
 * 2、在可能出现安全问题前 lock获取锁
 * 3、在可能出现安全问题后 unlock释放锁
 */
public class runnabletick implements Runnable{

    private  int tocket = 100;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            lock.lock();

            if(tocket > 0){
                try {
                    Thread.sleep(20);
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+tocket+"张票");
                    tocket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
