package Map.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Map<String,Student> ms = new HashMap<String,Student>();

        Student s1 = new Student("tom","10");
        Student s2 = new Student("jerry","11");
        Student s3 = new Student("spike","22");

        ms.put("001",s1);
        ms.put("002",s2);
        ms.put("003",s3);

        Set<Map.Entry<String, Student>> sme = ms.entrySet();
        for (Map.Entry<String, Student> s :sme){
            String num = s.getKey();
            Student stu = s.getValue();
            System.out.println(num+" , ["+stu.getName()+","+stu.getAge()+"]");
        }

    }
}
