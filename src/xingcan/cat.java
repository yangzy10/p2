package xingcan;

public class cat implements jumping{

    public cat() {
    }

    public cat(String name) {
        this.name = name;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(this.name+ "猫会跳");
    }
}
