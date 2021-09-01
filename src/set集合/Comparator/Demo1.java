package set集合.Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge()-s2.getAge();
                int num2 = num==0? s1.getName().compareTo(s2.getName()):num;
                return num2;

            }
        });

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
