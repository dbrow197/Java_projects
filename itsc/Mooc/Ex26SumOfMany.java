package Mooc;
import java.util.Scanner;


public class Ex26SumOfMany
{
    public static void main(String[]args){
    Scanner reader = new Scanner(System.in);
    int sum = 0;
    System.out.println("welcome! type a number and we will begin to add. ");
    System.out.println("You can always type in '0' to end. ");
    while (true) {
        int read = Integer.parseInt(reader.nextLine());
        if (read == 0){
            break;
        }
        sum = sum+read;
        System.out.println("sum now " + sum);
        System.out.println("enter another number");
    }
    
    System.out.println("Sum in the end is: " + sum);
    }
}
