package top.lijiulong.base.Ilterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * boolean hasNext() 如果集合中还有下一个元素，则返回true
 *
 */
public class itlerator_ {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("1");
        coll.add("2");
        coll.add("3");
        coll.add("4");
        coll.add("5");
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for(String s :coll){
            System.out.println(s);
        }
    }
}
