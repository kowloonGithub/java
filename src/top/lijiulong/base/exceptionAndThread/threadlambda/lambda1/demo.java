package top.lijiulong.base.exceptionAndThread.threadlambda.lambda1;

public class demo {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

//
//        invokeCook(()->{System.out.println("吃饭了");});
//
//        invokeCook(()->System.out.println("吃饭了"));
    }


    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
