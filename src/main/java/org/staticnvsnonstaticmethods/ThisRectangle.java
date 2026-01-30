package org.staticnvsnonstaticmethods;

public class ThisRectangle {
    int length;
    int breadth;

    void initialise(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        System.out.println("Length of the Rectangle is: "+length);
        System.out.println("Breadth of the Rectangle is: "+breadth);
    }

}
/* this keyword is used to call non-static members of the current class from a non-static method or constructor.
this keyword cannot be used in static methods
this.memberName is the syntax
 */