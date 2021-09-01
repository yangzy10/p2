package set集合.hashSetDemo;
//遍历学生列表，不重复
import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("tom", "12");
        Student s2 = new Student("jerry", "11");
        Student s3 = new Student("spike", "25");
        Student s4 = new Student("spike", "25");//s3和s4代表同一个学生，应当只输出一次。

        HashSet<Student> myStudents = new HashSet<Student>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);
        myStudents.add(s4);

        for (Student s : myStudents){
            s.show();//直接进行遍历，结果发现有重复输出。如何保证输出唯一呢？
        }
        //需要在student类里重写方法。现在输出是不重复的了。
    }
}
