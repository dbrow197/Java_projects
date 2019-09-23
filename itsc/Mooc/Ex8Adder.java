package Mooc;
import java.util.*;

public class Ex8Adder
{
   public static void main(String[] args){
       Scanner reader = new Scanner(System.in);
       int sum; 
       
       System.out.println("Enter a number: ");
       int number = Integer.parseInt(reader.nextLine());
       
       System.out.println("Type another number: ");
       int number2 = reader.nextInt();
       
       sum = number + number2;
       System.out.println("the sum of the numbers is " + sum);
       
       
    }
}
