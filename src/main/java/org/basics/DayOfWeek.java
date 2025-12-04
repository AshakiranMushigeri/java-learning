package org.example;
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your date");
        int day = scn.nextInt();

        switch(day){
            case 1:

                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
