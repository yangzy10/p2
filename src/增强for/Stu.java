package 增强for;

public class Stu {
    private String name;
    private String age;

    public Stu() {
    }

    public Stu(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void show(){
        System.out.println(this.name+" , "+this.age);
    }

}
