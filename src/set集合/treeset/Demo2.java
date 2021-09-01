package set集合.treeset;

import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();

        Student s1 = new Student("tom", 12);
        Student s2 = new Student("jerry", 12);
        Student s3 = new Student("spike", 25);
        Student s4 = new Student("littleSpike", 5);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Student s : ts){
            s.show();//进行遍历，发现报错。这是因为Student类未继承comparable接口。
            // 解决方法是在学生类中加入对该接口的继承，并重写方法compareTo。
        }
    }
}
