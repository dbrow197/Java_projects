package Mooc;
import java.util.Scanner;

public class Ex25VarChange{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        
        System.out.println("enter your first number ");
            read = reader.nextInt();
        
        System.out.println("enter your second number ");
           sum = reader.nextInt();
           sum = sum + read;
           
        System.out.println("enter your third number ");
            read = reader.nextInt();
            sum = sum + read;
        
    
        System.out.println("Sum: " + sum);
    }
}
