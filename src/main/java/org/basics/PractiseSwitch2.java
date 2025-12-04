package org.example;
import java.util.Scanner;

public class PractiseSwitch2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your month number");
        int month = scn.nextInt();
        System.out.println("Enter year");
        int y = scn.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 days");
                break;
            case 2:
                if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
                break;
            default:
                System.out.println("Invalid month number");

        }
    }
}
