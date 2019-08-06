package top.lijiulong.base.data_;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dataformat_ {
    public static void main(String[] args) throws Exception{

        /**
         * format(data) 日期格式化成文本
         * parse(String) 文本解析成日期
         *
         * yyyy-MM-dd HH-mm-ss
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.parse("2019-07-07"));
        System.out.println(sdf.format(new Date()));

        //计算你的出生天数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期:格式yyyy-MM-dd");
        String birthdayDateString = sc.next();
        Date birthdatDate = sdf.parse(birthdayDateString);
        long time = new Date().getTime() - birthdatDate.getTime();
        System.out.println(time/1000/60/60/24);
    }
}
