package pet;

public abstract class Animal {

    private String name;
    private int age;
    private int hunger;
    private int love;
    private int feel;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public int addAge() {
        age++;
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getHunger() {
        return hunger;
    }

    public void addHunger() {
        this.hunger +=5;
    }
    public void subHunger() {
        this.hunger -=10;
    }
    public int getLove() {
        return love;
    }

    public void addLove() {
        this.love +=5;
    }
    public void subLove() {
        this.love -=10;
    }

    public int getFeel() {
        return feel;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public void setFeel(int feel) {
        this.feel = feel;
    }

    public void addFeel() {
        this.feel +=5;
    }
    public void subFeel() {
        this.feel -=10;
    }

    public abstract void eat();

    public abstract void touch();

    public abstract void play();

    public abstract void bark();


}
