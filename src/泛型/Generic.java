package 泛型;

public class Generic<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void show(T t){
        System.out.println(t);
    }


}
