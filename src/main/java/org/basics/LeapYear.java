package org.example;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();

        if(year%400 == 0){
            System.out.println("This is a Leap Year");
        }
        else if(year % 4 == 0 && year % 100 != 0){
            System.out.println("This is a Leap year");
        }
        else{
            System.out.println("This is not a Leap Year");
        }
    }
}
