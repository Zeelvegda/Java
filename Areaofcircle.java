//lab 5-1
import java.util.Scanner;
class Circle{
    int radius;
    public double getareaofcircle(){
        return Math.PI*radius*radius;

    }
}
public class Areaofcircle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of circle");
        int radius=sc.nextInt();
        Circle c= new Circle();
        c.radius=radius;
        double area=c.getareaofcircle();
        System.out.println("area :"+area);
        sc.close();
    }
}