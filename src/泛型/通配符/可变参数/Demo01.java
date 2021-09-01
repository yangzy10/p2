package 泛型.通配符.可变参数;

//可变参数，即参数个数改变。
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println(sum(10, 20, 30, 40, 50));

    }

    public static int sum(int... a) {   //a成为一个数组，只需对数组求和即可
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }


}
