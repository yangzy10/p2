package pet;
public class Dog extends Animal{


    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        addHunger();
        bark();
    }

    @Override
    public void touch() {
        addLove();
        bark();
    }

    @Override
    public void play() {
        addFeel();
        bark();
    }

    @Override
    public void bark(){
        System.out.println("汪！");
    }
}
