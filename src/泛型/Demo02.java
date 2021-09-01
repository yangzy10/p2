package 泛型;

public class Demo02 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("tom");//setage只接受string
        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.setAge(20);//setage只能接受integer
        System.out.println(t.getAge());
        //有没有一种方法能同时接收不同的类型的数据？
        System.out.println("-------------------");

        Generic<String> g1 = new Generic<String>();
        g1.setT("tom");
        System.out.println(g1.getT());

        Generic<Integer> g2 = new Generic<Integer>();
        g2.setT(10);
        System.out.println(g2.getT());

        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.setT(true);
        System.out.println(g3.getT());

    }
}
