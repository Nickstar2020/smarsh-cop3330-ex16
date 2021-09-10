/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Scanner;

public class assignment16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //prompt for age
        System.out.println("What is your age?");
        int age = scan.nextInt();

        String output = age >= 16 ? "You are old enough to legally drive" : "You are still to young to legally drive!";
        System.out.println(output);

    }
}
