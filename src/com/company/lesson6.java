package com.company;
import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {

        Scanner grade1 = new Scanner(System.in);

        System.out.println("Enter your grade: ");

        int note = grade1.nextInt();

        if (note > 90) {
            System.out.println("You could pass the lesson with a bery high grade :)");
        }
        else if (note > 50) {
            System.out.println("You could pass the lesson!");
        }
        else {
            System.out.println("You could not pass the lesson :(");
        }
    }
}
