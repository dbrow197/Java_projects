package Mooc;
import java.util.*;

public class Ex10Circumference
{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the Radius: ");
        double radius = Integer.parseInt(reader.nextLine());
        
        double cir;
        cir = (2*Math.PI*radius);
        
        System.out.println("the circumference of the circle is: " + cir);
        
        
    }
}
