package Mooc;
import java.util.Scanner;


public class Ex11BiggerNumb
{
   public static void main(System[]args){
       Scanner reader = new Scanner(System.in);
       
       System.out.println("Type a number: ");
       int number = Integer.parseInt(reader.nextLine());
       
       System.out.println("Type another number: ");
       int number2 = reader.nextInt();
       int big=0;
       if (number2 > number){
           big = number2;
        } else {
            big = number;
        }
       System.out.println("the bigger number of the two numbers given was: " + big);
       
       
    }
}
