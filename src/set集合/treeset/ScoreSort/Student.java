package set集合.treeset.ScoreSort;

public class Student {
    private String name;
    private int cn;
    private int ma;

    public Student() {
    }

    public Student(String name, int cn, int ma) {
        this.name = name;
        this.cn = cn;
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCn() {
        return cn;
    }

    public void setCn(int cn) {
        this.cn = cn;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getTotal(){
        int total = this.cn+this.ma;
        return total;
    }

    public void show(){
        System.out.println(this.name+": chinese: "+this.cn+"  math: "+this.ma+"  total: "+getTotal());
    }
}
