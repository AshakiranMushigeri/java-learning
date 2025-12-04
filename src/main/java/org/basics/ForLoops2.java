package org.example;
import java.util.Scanner;

public class ForLoops2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = scn.nextInt();
        int sum = 0;
        for(int i=1; i<=n;i++){
            sum += i;
        }
        System.out.println("The sum from 1 to "+n+" ="+sum);
    }

}
