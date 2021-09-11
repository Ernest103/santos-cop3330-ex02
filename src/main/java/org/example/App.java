package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Q_2
        Scanner sc = new Scanner(System.in);
        String input_q2;

        System.out.println("What is the input string?");
        input_q2 = sc.nextLine();

        System.out.println(input_q2 + "has " + input_q2.length() + " characters");
    }
}
