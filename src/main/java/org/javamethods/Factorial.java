package org.javamethods;
import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println("Factorial of the given number is "+factorial(n));
    }
}
