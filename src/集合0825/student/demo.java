package 集合0825.student;

import java.util.ArrayList;
import java.util.Iterator;

public class demo {
    public static void main(String[] args) {
        Student s1 = new Student("tom", "12");
        Student s2 = new Student("jerry", "11");
        Student s3 = new Student("spike", "25");

        ArrayList<Student> myStudents = new ArrayList<Student>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        Iterator<Student> it = myStudents.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            s.show();
        }
        System.out.println("hello".hashCode());


    }
}
