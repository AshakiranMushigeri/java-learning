package org.example;
import java.util.Scanner;

public class FruitsSwitch {
    public static void main(String[] args) {
        System.out.println("Enter your favorite fruit");
        Scanner scn = new Scanner(System.in);
        String fruit = scn.next();

        switch(fruit){
            case "mango":
                System.out.println("Kin of Fruits");
                break;
            case "apple":
                System.out.println("Keeps the doctor away");
                break;
            default:
                System.out.println("Unknown fruit");
        }
    }
}
