package top.lijiulong.base.data_;

import java.util.Date;

public class data_ {
    public static void main(String[] args) {
        /**
         * 时间戳精确到1毫秒
         * 中国属于东八区，1970.1.1 08.00.00
         */
        System.out.println(System.currentTimeMillis());

        System.out.println(new Date());
        System.out.println(new Date().getTime());
        System.out.println(new Date(3742767540068L));
    }
}
