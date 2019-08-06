package top.lijiulong.base.data_;

import java.util.Calendar;

public class calendar_ {
    public static void main(String[] args) {


        /**
         *  Calendar类的常用成员方法:
         *         public int get(int field)：返回给定日历字段的值。
         *         public void set(int field, int value)：将给定的日历字段设置为给定值。
         *         public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
         *         public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
         */

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

    }
}
