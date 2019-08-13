package top.lijiulong.base.lambda.lambda;

/**
 * @program java
 * @description: Logger
 * @author: jiulong.li
 * @date: 2019/08/12 11:11
 */
public class demo01 {
    public static void showLog(int level, String message){
        if(level == 1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {

        String msg1 = "Hello";
        String msg2 = "world";
        String msg3 = "java";

        showLog(1,msg1+msg2+msg3);
    }
}
