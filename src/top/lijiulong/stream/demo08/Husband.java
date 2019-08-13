package top.lijiulong.stream.demo08;

/**
 * @program java
 * @description: 使用this引用本类的成员方法
 * @author: jiulong.li
 * @date: 2019/08/13 17:28
 */
public class Husband {
    public void buyHouse(){
        System.out.println("北京二环内买一套四合院");
    }

    public void marry(Richable r){
        r.buy();
    }

    public void soHappy(){
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
