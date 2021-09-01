package 泛型;

public class Demo03 {
    public static void main(String[] args) {
        Generic<String> g1 = new Generic<String>();
        g1.show("tom");

        Generic<Integer> g2 = new Generic<Integer>();
        g2.show(100);

        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.show(true);

        Generic<Double> g4 = new Generic<Double>();
        g1.show(String.valueOf(114.2));
    }
}
