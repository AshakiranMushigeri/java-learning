package org.javamethods;

public class MultiplyOverloading {
    void multiply(int a, int b){
        System.out.println(a*b);
    }
    void multiply(int a, int b, int c){
        System.out.println(a*b*c);
    }
    void multiply(int a, double b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        MultiplyOverloading mo = new MultiplyOverloading();
        mo.multiply(6,7);
        mo.multiply(5,6,8);
        mo.multiply(4,5.6);
    }
}
