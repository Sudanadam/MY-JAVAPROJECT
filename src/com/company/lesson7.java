package com.company;
import java.util.Scanner;

public class lesson7 {

    /*     !(3<4) -------- if true, convert false,(opposite true)
               &&     -------- and
               ||     -------- or
    */

    public static void main(String[] args) {

        // etc :      System.out.println("result :"  + ((3<4) && ("yazılım" == "yazılım")));

        String sys_user_name = "hamican";
        String sys_password = "123";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter user name: ");
        String username = scan.nextLine();

        System.out.println("Enter password: ");
        String password = scan.nextLine();

        if (!(sys_user_name.equals(username)) && !(sys_password.equals(password))){
            System.out.println("Username and Password is wrong");
        }
        else if (!(sys_user_name.equals(username)) && (sys_password.equals(password))){
            System.out.println("Username is wrong");
        }
        else if ((sys_user_name.equals(username)) && !(sys_password.equals(password))){
            System.out.println("Password is wrong");
        }
        else if ((sys_user_name.equals(username)) && (sys_password.equals(password))){
            System.out.println("Welcome to your profile!");
        }
    }
}
