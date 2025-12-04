package org.example;
import java.util.Scanner;

public class PalindromeWithWhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = n;
        int m = 0;
        while(n>0){
            m = (m*10) + (n%10);
            n/=10;
        }

        if(a==m){
            System.out.println("Its a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
