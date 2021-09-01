package 泛型.接口;

public class Demo {
    public static void main(String[] args) {
        Generic<String> g1 = new GenericImpl<String>();
        g1.show("tom");
    }
}
