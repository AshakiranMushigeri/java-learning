package org.javamethods;

public class VarargsSum {

    public static int sum(int...nums){
        int total = 0;
        for(int n : nums){
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Sum = "+sum(5,10));
        System.out.println("Sum = "+sum(5,10,15,20));
    }
}
