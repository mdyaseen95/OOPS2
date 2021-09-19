package org.example.AbstractMethod;



abstract class Shape{
    abstract void draw();
}
class Rectange extends Shape {
    void draw(){
        System.out.println("Drawing a Rectangle ");
    }
}
class Circle extends Shape {
    void draw(){
        System.out.println("Drawing a Circle");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        Shape s1 = new Circle() ;
        s1.draw();
    }
}
