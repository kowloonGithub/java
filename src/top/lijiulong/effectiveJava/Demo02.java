package top.lijiulong.effectiveJava;

/**
 * @program java
 * @description: 遇到多个构造器参数时，要考虑用构造器
 * @author: jiulong.li
 * @date: 2019/08/12 10:13
 *
 * 1、多参数时
 * 可以使用多个参数构造器， 缺点：实现起来不方便
 * 也可以无参数构造器+setter方法 缺点：javaBean可能处于不一致状态，阻止了把类变成不可变的可能，需要保护线程安全
 * Builder模式：
 *
 */
public class Demo02 {

    public static void main(String[] args) {
        NutritionFacts n = new NutritionFacts.Builder().name("jiulong.li").age(22).address("beijing").height(170).build();
    }
}

class NutritionFacts{
    private int age;
    private String name;
    private String address;
    private int height;

    private NutritionFacts(Builder builder){
        this.age =builder.age;
        this.name = builder.name;
        this.address = builder.address;
        this.height = builder.height;
    }

    public static class Builder{
        private int age = 0;
        private String name = "";
        private String address = "";
        private int height = 0;

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public  Builder height(int height) {
            this.height = height;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }
}
