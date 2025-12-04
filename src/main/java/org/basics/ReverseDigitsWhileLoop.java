package org.example;
import java.util.Scanner;

public class ReverseDigitsWhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int m = 0;

        while(n > 0){
            m = (m*10) + (n%10);
            n/= 10;
        }
        System.out.println("The reverse of your number is "+m);
    }
}
