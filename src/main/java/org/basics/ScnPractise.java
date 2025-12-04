package org.example;
import java.util.Scanner;

public class ScnPractise {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your roll no");
        int rollno = scn.nextInt();
        System.out.println("In the next 10 years you will be " +(rollno+10)+ " years old");
    }
}
