package org.example;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter operator (+, -, *, /) ");
        char op = scn.next().charAt(0);

        System.out.println("Enter two numbers");
        int a = scn.nextInt();
        int b = scn.nextInt();

        switch(op) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}
