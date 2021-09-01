package TeacherAndStudent;

public class teacher extends human{

    public teacher() {

    }

    public teacher(String name, String age) {
       super(name,age);
    }

    @Override
    public void teach(){
        System.out.println(getName()+"老师教书");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(String age) {
        super.setAge(age);
    }
}
