package catanddog;

public class Demo {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.setName("tom");
        c.setAge("12");
        System.out.println(c.getName()+" , "+c.getAge());
        System.out.println("---------------------------");

        Animal cc = new Cat("jerry","22");
        System.out.println(cc.getName()+" , "+cc.getAge());
        System.out.println("---------------------------");

        Animal d = new Dog();
        d.setName("spike");
        d.setAge("35");
        System.out.println(d.getName()+" , "+d.getAge());
        System.out.println("---------------------------");

        Animal dd = new Dog("littleSpike","2");
        System.out.println(dd.getName()+" , "+dd.getAge());
        System.out.println("---------------------------");






    }
}
