package org.javamethods;

public class OrderOfParameters {

    void show(int a, String b){
        System.out.println(a+ " " +b);
    }
    void show(String a, int b){
        System.out.println(a+ " " +b);
    }

    public static void main(String[] args) {
        OrderOfParameters op = new OrderOfParameters();
        op.show(10,"Asha");
        op.show("Asha",10);
    }
}
