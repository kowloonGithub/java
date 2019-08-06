package top.lijiulong.base.exceptionAndThread;

public class thread_ {
    public static void main(String[] args) {
        /**
         * 主线程main
         *
         * 创建多线程步骤：
         *  1、创建Thread类的子类
         *  2、重写子类的run方法
         *  3、调用start方法，执行线程，执行run方法
         */

        MyThread mt = new MyThread();
        mt.start();
        for(int i = 0;i<20;i++){
            System.out.println("main:"+i);
        }
    }
}
