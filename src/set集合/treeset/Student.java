package set集合.treeset;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public void show() {
        System.out.println(name + " , " + age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student s) {
        //return -1;//return的数字影响遍历结果。
        // 0：只输出第一个；
        // 正数：顺序遍历；
        // 负数：反向遍历。

        //案例：按照年龄升序排列，如何做到？
        //int num = this.age - s.age;
        //return num;
        //还是有问题。如果两个人的年龄一样，只输出一个人。如何解决？

        int num = this.age - s.age;
        int num2 = num ==0? this.name.compareTo(s.name):num; //在年龄相同的情况下，在用姓名作为比较。
        return num2;
    }
}