package 增强for;

import list0826.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeDemo1 {
    public static void main(String[] args) {


        List<Stu> s = new ArrayList<Stu>();
        Stu s1 = new Stu("tom", "10");
        Stu s2 = new Stu("jerry", "9");
        Stu s3 = new Stu("spike", "20");
        s.add(s1);
        s.add(s2);
        s.add(s3);
        //list使用三种方式遍历学生对象

        //普通for循环
        System.out.println("普通for循环");
        for (int i = 0; i < s.size(); i++) {
            Stu ss = s.get(i);
            System.out.println(ss.getName() + " , " + ss.getAge());
        }
        System.out.println("-------");

        //增强for循环
        System.out.println("增强for循环");
        for (Stu i : s) {
            System.out.println(i.getName() + " , " + i.getAge());
        }
        System.out.println("-------");

        //迭代器
        System.out.println("迭代器");
        Iterator<Stu> it = s.iterator();
        while (it.hasNext()) {
            Stu ss = it.next();
            ss.show();
        }
    }
}
