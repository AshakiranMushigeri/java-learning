package org.example;
import java.util.Scanner;
public class EvenOddNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if(num%2 == 0){
            System.out.println("This is an Even Number");
        }
        else{
            System.out.println("This is an odd number");
        }
    }
}
