package top.lijiulong.effectiveJava;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @program java
 * @description: 消除过期的对象引用
 * @author: jiulong.li
 * @date: 2019/08/13 20:24
 */
public class Demo06 {

}

class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object o){
        ensureCapacity();
        elements[size++] = o;
    }

    public Object pop(){
        if(size == 0){
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
