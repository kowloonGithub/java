package top.lijiulong.base.exceptionAndThread.innerclass_;

public class innerclassthread {
    public static void main(String[] args) {

        new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 20; i++){
                    System.out.println(Thread.currentThread().getName()+"-->"+"黑马");
                }
            }
        }.start();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 20; i++){
                    System.out.println(Thread.currentThread().getName()+"-->"+"程序员");
                }
            }
        };
        new Thread(r).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i< 20;i++){
                    System.out.println(Thread.currentThread().getName()+"-->"+"同程艺龙");
                }
            }
        }).start();
    }
}
