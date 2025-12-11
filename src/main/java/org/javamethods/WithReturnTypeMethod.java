package org.javamethods;

public class WithReturnTypeMethod {
    public static double getArea(int r){
        return 3.14 * r *r;
    }

    public static void main(String[] args) {
        double Result = getArea(45);
        System.out.println("Area of the circle = "+Result);
    }
}
