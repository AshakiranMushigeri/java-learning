package org.javamethods;

/*
Method overloading means creating methods wth same name but different parameters.
Java decides which method to run at compile time based on:
1)no of parameters
2)type pf parameters
3)order of parameters
Not based on return type alone
*/

public class MethodOverloading {
   //Method 1
    static int add(int a, int b){
        return a+b;
    }
    //Method 2
    static int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
       int sum1 = add(5,6);
       int sum2 = add(5,6,7);
        System.out.println("Total sum= "+(sum1+sum2));

    }
}
