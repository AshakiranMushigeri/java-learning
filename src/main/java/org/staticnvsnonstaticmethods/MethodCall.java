package org.staticnvsnonstaticmethods;

public class MethodCall {

    //static method 1
    static void staticMethodOne(){
        System.out.println("Inside staticMethodOne");
    }

    //static method 2 calling another static method
    static void staticMethodTwo(){
        System.out.println("Inside staticMethodTwo");
        staticMethodOne(); //static calling static
    }

    //Non-static Method
    void nonStaticMethod(){
        System.out.println("Inside nonStaticMethod");
        staticMethodOne(); //non-static calling static
        staticMethodTwo(); //non-static calling static
    }

    public static void main(String[] args) {
        //Calling static methods directly
        staticMethodOne();
        staticMethodTwo();

        //creating object to call non-static method
        MethodCall obj = new MethodCall();
        obj.nonStaticMethod();
    }
}
//*****NOTE: Static methods can’t access non-static members directly because they don’t have an object reference.
//Static members are accessed using the class name because they belong to the class, not to objects.