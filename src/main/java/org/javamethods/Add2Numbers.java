package org.javamethods;
import java.util.Scanner;


public class Add2Numbers {
    public static int addition(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("Enter your two numbers");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int Sum = addition(a,b);
        System.out.println("The Sum of the two numbers is = "+Sum);
    }
}
