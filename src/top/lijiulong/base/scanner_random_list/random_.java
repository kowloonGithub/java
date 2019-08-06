package top.lijiulong.base.scanner_random_list;

import java.util.Random;

public class random_ {
    public static void main(String[] args) {
        //生成随机数，左开右闭
        Random r = new Random();
        System.out.println("随机数是："+r.nextInt());
        System.out.println("随机数是："+r.nextInt(5));
    }
}
