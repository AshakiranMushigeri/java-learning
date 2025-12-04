package org.example;
import java.util.Scanner;
public class BiggerNumber {
    public static void main(String[] args) {
        System.out.println("Enter your numbers");
        Scanner scn = new Scanner(System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();

        if(a>b){
            System.out.println("a is the bigger number");
        }
        else if(b>a){
            System.out.println("b is the bigger number");
        }
        else{
            System.out.println("a and b are equal");
        }
    }
}
