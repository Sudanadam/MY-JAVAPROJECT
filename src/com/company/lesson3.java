package com.company;

import java.util.Locale;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {

    Scanner scan1 = new Scanner(System.in);
    scan1.useLocale(Locale.US);
    System.out.println("Enter a double number: ");
    double a = scan1.nextDouble();

    Scanner scan2 = new Scanner(System.in);
    System.out.println("Enter a int number: ");
    int b = scan2.nextInt();

    Scanner scan3 = new Scanner(System.in);
    System.out.println("Enter a int number: ");
    String c = scan3.nextLine();

    System.out.println("a s value is : "+ a);
    System.out.println("b s value is : "+ b);
    System.out.println("c s value is : "+ c);



    }
}
