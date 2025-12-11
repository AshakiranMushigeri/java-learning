package org.javamethods;

public class LargerNumber {

    public static int largerNo(int a, int b){
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        int Winner= largerNo(654,894);
        System.out.println("The Larger Number is = "+Winner);
    }
}
