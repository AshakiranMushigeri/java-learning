package org.example;
import java.util.Scanner;

public class ScannerPractise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hey there! Enter your name");
        String str = scn.next();
        System.out.println("Welcome "+ str);

        System.out.println("Thank you, now please enter your year of birth");
        int num = scn.nextInt();
        int age = 2025 - num;
        System.out.println("You are "+age+" years old");



    }
}
