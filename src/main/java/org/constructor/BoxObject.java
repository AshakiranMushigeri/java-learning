package org.constructor;

public class BoxObject {
    public static void main(String[] args) {
        Box b1 = new Box(5,6,4);
        Box b2 = new Box();
        Box b3 = new Box(6);

        b1.display();
        b2.display();
        b3.display();
    }
}

/*
Creating multiple constructors in the same class with different argument types is known as Constructor overloading.
 */