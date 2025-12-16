package org.javamethods;
//

public class OverloadingwithDiffDataTypes {
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        OverloadingwithDiffDataTypes c = new OverloadingwithDiffDataTypes();

        System.out.println(c.add(5,10));
        System.out.println(c.add(2.2,8.6));
    }
}
