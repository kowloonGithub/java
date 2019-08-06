package top.lijiulong.base.string_;

public class stringbuilder_ {
    public static void main(String[] args) {


        //构造函数
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("abc");
        System.out.println(sb+""+sb1);
        sb1.append("abcd");
        System.out.println(sb1);
    }
}
