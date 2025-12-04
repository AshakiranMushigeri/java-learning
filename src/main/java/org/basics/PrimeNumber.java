package org.example;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        if (n <= 1) {
            System.out.println("Not a prime number");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
    }
}
