package top.lijiulong.base.lambda.lambda;

/**
 * @program java
 * @description: lambda特点 延迟加载，前提要有函数式接口
 * @author: jiulong.li
 * @date: 2019/08/12 11:13
 */
public class demo02lambda {

    public static void showLog(int level, MessageBuilder mb){
        if(1 == level){
            System.out.println(mb.buildMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(2,()->{
            System.out.println("不满足条件则不执行");
            return msg1+msg2+msg3;
        });
    }

}
