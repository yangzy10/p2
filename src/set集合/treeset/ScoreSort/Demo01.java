package set集合.treeset.ScoreSort;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo01 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getTotal()-s1.getTotal();//以总分降序排列
                int num2 = num ==0? s2.getCn()-s1.getCn():num;//如总分一样，以语文成绩降序排列
                int num3 = num2==0? s1.getName().compareTo(s2.getName()):num2;//如果总分和语文成绩都一样，以姓名升序排列。
                return num3;
            }
        });

        Student s1 = new Student("amber",90,80);
        Student s2 = new Student("lisa",100,85);
        Student s3 = new Student("kaeya",90,80);
        Student s4 = new Student("klee",70,100);
        Student s5 = new Student("noelle",100,100);
        Student s6 = new Student("jean",90,95);
        Student s7 = new Student("jean",90,95);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for (Student s : ts){
            s.show();
        }









    }
}
