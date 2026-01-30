package org.constructor;

public class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void display(){
        System.out.println("The Length of the Rectangle is: "+length);
        System.out.println("The Breadth of the Rectangle is: "+breadth);
    }
}

/* Constructor is a special type of method that gets executed everytime an instance is created using the new keyword.
   Constructor should have the same name as the class
   Static modifier cannot be used for constructor
   There is no return type for constructor
   Constructors without arguments are called default constructor
   Constructors with arguments are called parameterised constructor
   When a class is created with no constructor,  java implicitly adds a default constructor
   USES: It is used to initialise an object
 */