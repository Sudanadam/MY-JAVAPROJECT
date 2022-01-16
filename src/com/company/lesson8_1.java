package com.company;
import java.util.Scanner;

public class lesson8_1 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int bakiye = 1000;
        int islem;

        System.out.println("1: show my balance.");
        System.out.println("2: deposit money");
        System.out.println("3: withdrow money");
        System.out.println("4: Exit");
        System.out.println("Choose a precess!!!");

        islem = scan.nextInt();

        switch(islem) {
            case 1:
                System.out.println("Your balance is " + bakiye + " tl");
                break;

            case 2:
                System.out.println("How much tl do you want to deposit?");
                int miktar = scan.nextInt();
                bakiye = bakiye + miktar;
                System.out.println("Your balance is " + bakiye + " tl");
                break;

            case 3:
                System.out.println("How much tl do you want to withdrow?");
                miktar = scan.nextInt();
                bakiye = bakiye - miktar;
                System.out.println("Your balance is " + bakiye + " tl");
                break;

            case 4:
                System.out.println("Shuting down system");
                break;

            default:
                System.out.println("Invalid process");
                break;
        }
    }
}