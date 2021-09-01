package list0826;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("tom", "12");
        Student s2 = new Student("jerry", "11");
        Student s3 = new Student("spike", "25");

        List<Student> myStudents = new ArrayList<Student>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);
        //迭代器遍历
        Iterator<Student> it = myStudents.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+" , "+s.getAge());
        }
        //循环遍历
        for (int i = 0; i < myStudents.size(); i++){
            Student s = new Student();
            s = myStudents.get(i);
            System.out.println(myStudents.get(i).getName()+" , "+myStudents.get(i).getAge());
        }

    }
}
