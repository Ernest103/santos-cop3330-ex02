package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
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
