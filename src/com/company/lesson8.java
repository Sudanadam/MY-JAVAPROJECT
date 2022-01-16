package com.company;
import java.util.Scanner;

public class lesson8 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a numb: ");
        int numb = scan.nextInt();

        switch (numb){

            case 1:
                System.out.println("Numb is 1");
                break;

            case 2:
                System.out.println("Numb is 2");
                break;

            case 3:
                System.out.println("Numb is 3");
                break;

            default:
                System.out.println("Please try again!");
                break;
        }
    }
}
