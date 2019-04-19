package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner keys = new Scanner(System.in);
        // promting user to enter a number to check for prime number
        System.out.println("Enter a number range to check if it's prime or not");
        int  range = keys.nextInt();
        System.out.println("1 is not a prime number");
        for (int num = 2; num <= range; num++) {
            boolean flag = false;
            // condition for nonprime number
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0){
                    flag = true;
                }
            }
            // prints the output of the result to the condition
            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }
}
