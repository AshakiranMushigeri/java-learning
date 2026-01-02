package org.staticnvsnonstaticmethods;

public class Main {

    public static void main(String[] args) {
        D obj1 = new D();
        D obj2 = new D();

        obj1.increment();
        obj1.display("After obj1.increment()");

        obj2.increment();
        obj2.display("After obj2.increment()");

        obj1.increment();
        obj1.display("After obj1.increment() again");

    }
}
 //********* Static variables keep accumulating across objects, while instance variables track state per object.
/*- `static int i` is **shared** by all objects of the class.
- `int j` is **unique** to each object. */