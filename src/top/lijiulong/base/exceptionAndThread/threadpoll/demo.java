package top.lijiulong.base.exceptionAndThread.threadpoll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *Executors:线程池工厂类，用来生成线程池
 *  newFixedThreadPool创建可重用的固定线程池
 *
 * ExecutorService线程池接口
 *  submit/shutdown
 *
 * 1、创建指定数量的线程池
 * 2、创建类，实现Runnable接口，实现run方法
 * 3、调用sumbit
 * 4、调用shutdown
 */
public class demo {
    public static void main(String[] args) {
        //指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(4);

        es.submit(new thread());
        es.submit(new thread());
        es.submit(new thread());
        es.submit(new thread());
    }
}
