package org.javarecursionbasics;

public class PrintNumbers {
    static void print(int n){
        if(n == 0)
            return;
        System.out.println(n); //before recursion
        print(n-1);
        System.out.println(n); //after recursion
    }

    public static void main(String[] args) {
        print(3);
    }
}
