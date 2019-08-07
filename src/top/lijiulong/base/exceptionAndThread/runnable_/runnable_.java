package top.lijiulong.base.exceptionAndThread.runnable_;


public class runnable_ {
    /**
     * 多线程第二种方法，实现Runnable接口
     *1、创建一个Runnable接口的实现类，实现类重新run方法
     *2、创建该实现类为对象
     *3、创建Thread对象，构造参数传入该对象
     *4、调用Thread类的start方法
     */
    public static void main(String[] args) {
        runnable1 runnable1_ = new runnable1();
        Thread t = new Thread(runnable1_);
        t.start();

        for( int i = 0; i < 20; i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }

}
