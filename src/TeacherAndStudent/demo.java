package TeacherAndStudent;

import java.sql.SQLInvalidAuthorizationSpecException;

public class demo {
    public static void main(String[] args) {
        human t1 = new teacher();
        t1.setName("林青霞");
        t1.setAge("12");
        System.out.println(t1.getName() + " , " + t1.getAge());
        t1.teach();
        student s = new student();

        teacher t2 = new teacher("风清扬", "33");
        System.out.println(t2.getName() + " , " + t2.getAge());
        t2.teach();

        System.out.println("------------------------------");

        human s1 = new student();
        s1.setName("左冷禅");
        s1.setAge("34");
        System.out.println(s1.getName() + " , " + s1.getAge());
        s1.study();

        student s2 = new student("岳不群", "45");
        System.out.println(s2.getName() + " , " + s2.getAge());
        s2.study();
    }
}
