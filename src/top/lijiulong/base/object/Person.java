package top.lijiulong.base.object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 重新toString方法
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    /**
     *Object的equals默认比较两个对象的地址值，意义不大
     * 需要重新equals方法
     */
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person)obj;
        return age == person.age && Objects.equals(name,person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}
