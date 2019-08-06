package top.lijiulong.base.array;


/**
 * 动态初始化：指定长度   数据类型[] 数组名称 = new 数据类型[数组长度];
 * 数组会有默认的值;
 * 如果是整数类型，那么默认为0；
 * 如果是浮点类型，那么默认为0.0；
 * 如果是字符类型，那么默认为'\u0000'；
 * 如果是布尔类型，那么默认为false；
 * 如果是引用类型，那么默认为null
 *
 * 静态初始化：指定内容
 *
 *直接打印数组名，是内存hash值
 */
public class Demo01Array {
    public static void main(String[] args) {
        int[] arrayA = new int[300];
        int[] arrayB = new int[]{1,2,3,4,5,6,7,8,9};
        int[] arrayC = {1,2,3,4,5,6,7,8,9};

        System.out.println(arrayA);
        System.out.println(arrayB.length);
    }
}
