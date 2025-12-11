package org.javamethods;
import java.util.Scanner;

public class EvenOrOdd {

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        boolean Result = isEven(a);
        System.out.println("The number is Even? "+Result);
    }
}
