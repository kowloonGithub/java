package top.lijiulong.base.lambda.Supplier;

import java.util.function.Supplier;

/**
 * @program java
 * @description: supplier求数组的最大值
 * @author: jiulong.li
 * @date: 2019/08/13 13:44
 */
public class SupplierTest {

    public static int getMax(Supplier<Integer> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        int[] arr = {100,0,-25,88,33,-30};
        int maxValue = getMax(()->{
           int max = arr[0];
           for(int i : arr){
               if(i > max){
                   max = i;
               }
           }
           return max;
        });

        System.out.println(maxValue);
    }



}
