package top.lijiulong.stream.demo07;

/**
 * @program java
 * @description: 子类
 * @author: jiulong.li
 * @date: 2019/08/13 17:09
 */
public class man extends Human{

    @Override
    public void sayHello() {
        System.out.println("Hello 我是Man");
    }

    public void method(Greetable g){
        g.greent();
    }

    public void show(){
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new man().show();
    }



}
