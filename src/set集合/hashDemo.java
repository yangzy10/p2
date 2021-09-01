package set集合;
//哈希值：
//是jdk根据对象地址或字符串或数字算出来的【int】类型的数值。哈希值不是地址值。

public class hashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("tom","12");
        Student s2 = new Student("jerry","10");
        Student s3 = new Student("spike","22");
        //默认情况下，不同对象的哈希值是不同的。但通过在类中方法重写，可以让不同对象的哈希值相同。
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println("-------------------");
        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());

        //不同字符串，得到了相同的哈希值
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395

    }

}
