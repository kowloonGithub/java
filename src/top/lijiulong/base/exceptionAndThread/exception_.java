package top.lijiulong.base.exceptionAndThread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exception_ {
    public static void main(String[] args) {
        /**
         * Throwable 所有错误异常的超类
         *  Exception 编译器异常
         *  RuntimeException 运行时异常
         *  Error 错误
         *
         *
         *
         */

        //编译异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse("2019-0808");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //运行异常
        int[] arr = {1,2,3};
        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //error
        int[] arr1 = new int[1024*1024*2048];
        System.out.println("后续代码");

    }
}
