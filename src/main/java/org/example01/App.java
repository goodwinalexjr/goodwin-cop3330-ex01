package org.example01;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
        String Name = name.nextLine();
        System.out.print("Hello, ");
        System.out.print(Name);
        System.out.println(", nice to meet you!");
    }
}
