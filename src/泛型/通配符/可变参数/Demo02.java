package 泛型.通配符.可变参数;

//可变参数，即参数个数改变。
public class Demo02 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println(sum(10, 20, 30, 40, 50));

    }

    public static int sum(int b,int... a) {   //如果有固定的参数，应当放在前面；可变参数放在最后
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }


}
