package Mooc;
import java.util.*;

public class Ex9ADivider
{
   public static void main(String[] args){
       Scanner reader = new Scanner(System.in);
       int Quotient; 
       
       System.out.println("Enter a number: ");
       int number = Integer.parseInt(reader.nextLine());
       
       System.out.println("Type another number: ");
       int number2 = reader.nextInt();
       
       Quotient = number / number2;
       System.out.println("the Quotient of the numbers is " + Quotient);
       
       
    }
}
