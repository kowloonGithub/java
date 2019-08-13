package top.lijiulong.stream.demo10;

/**
 * @program java
 * @description: 数组构造器的引用
 * @author: jiulong.li
 * @date: 2019/08/13 18:06
 */
public class Demo {
    public static int[] createArray(int length, ArrayBuilder ab){
        return ab.builderArray(length);
    }

    public static void main(String[] args) {
        int[] arr1 = createArray(10, len -> new int[len]);
        int[] arr2 = createArray(10, int[]::new);
    }
}
