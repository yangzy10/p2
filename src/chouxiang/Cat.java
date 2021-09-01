package chouxiang;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("cat eats fish");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
