package Mooc;
import java.util.*;
public class ReadUserInput
{
    public static void main(String[] args){
       Scanner reader = new Scanner(System.in);
       
       System.out.println("who is greeted? ");
       String name = reader.nextLine();
       
       System.out.print("How old are you? ");
       int age = Integer.parseInt(reader.nextLine());
       
       System.out.println("Your name is: " + name + ", and you are " + age + " years old, nice to meet you!");
        
        
    }
}
