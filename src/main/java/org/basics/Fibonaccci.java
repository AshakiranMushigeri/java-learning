package org.example;
import java.util.Scanner;

public class Fibonaccci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = scn.nextInt();

        if(n<=0){
            System.out.println("invalid input");
            return;
        }

        int a=0, b=1;

        System.out.println("Fibonacci Series: "+a);

        if(n>1){
            System.out.println(" "+b);
        }
        for(int i = 1; i<=n-2; i++){
            int c = a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }
}
