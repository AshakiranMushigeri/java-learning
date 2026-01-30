package org.constructor;

public class Box {

    int height;
    int width;
    int length;

    Box() {
    }
    Box(int h, int w, int l) {
        height = h;
        width = w;
        length = l;
    }
    Box(int n) {
        height = n;
        width = n;
        length = n;
    }
    void display() {
        System.out.println("[Height: "+height+" Width: "+width+" Length: "+length+"]");
    }
}
