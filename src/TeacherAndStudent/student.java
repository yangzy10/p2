package TeacherAndStudent;

public class student extends human{

    public student() {
    }

    public student(String name, String age) {
        super(name, age);
    }

    @Override
    public void study(){
        System.out.println(getName()+"学习");
    }

}
