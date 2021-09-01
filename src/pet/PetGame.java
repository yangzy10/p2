package pet;
import java.util.Scanner;
public class PetGame {
    public static void main(String[] args) {
        Animal d = new Dog("Spike",12);
        d.setLove(50);
        d.setFeel(30);
        d.setHunger(40);
        int time = 0;
        //
        while (d.getFeel()!=0 && d.getLove()!=0 && d.getHunger()!=0)
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("your pet: "+d.getName()+"  age: "+d.getAge());

            System.out.println("请选择操作：");
            System.out.print("1-----feed");
            System.out.print("  2-----touch");
            System.out.println("  3-----play");
            System.out.print("Status:\nhunger:"+d.getHunger()+" ; ");
            System.out.print("love:"+d.getLove()+" ; ");
            System.out.println("feel:"+d.getFeel());
            System.out.print("your command: ");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    d.eat();
                    time++;
                    break;
                case 2:
                    d.touch();
                    time++;
                    break;
                case 3:
                    d.play();
                    time++;
                    break;
                default:
                    System.out.println("wrong number");
                    break;
            }
            if(time!=0 && time%5==0){
                d.subFeel();
                d.subLove();
                d.subHunger();
                d.addAge();
            }
        }

        System.out.println("your pet died!");
        System.exit(0);




    }
}
