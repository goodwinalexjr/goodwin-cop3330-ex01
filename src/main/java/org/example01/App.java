/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example01;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner name = new Scanner(System.in);
        System.out.print("What is your name?");
        String Name = name.nextLine();
        System.out.print("Hello, ");
        System.out.print(Name);
        System.out.println(", nice to meet you!");
    }
}
