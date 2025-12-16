package org.javamethods;

public class VarArgsOverloading {

    static void add(int a, int b){
        System.out.println(a+b);
    }

    static void add(int...a){
        int sum = 0;
        for(int i : a) sum += i;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        add(10,20);
        add(1,2,2,3,4);
    }
}
/*NOTE: Java resolves overloaded methods by choosing the most specific match.
Fixed-parameter methods take priority over var-args, and var-args are internally treated as arrays
 */
