package org.staticnvsnonstaticmethods;

public class D {

    static int i; //class-level (shared) variable
    int j; //object-level (unique per object)

    void increment(){
        i++; //shared across all objects
        j++; //specific to this object
    }

    void display(String label){
        System.out.println(label + " -> i= " + i + ", j= " +j);
    }

}
