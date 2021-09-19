package org.example.multipleinterfaces;
interface Printable{
    void print();
}

interface Showable extends Printable {
    void show();
}

class AB implements Showable{
    public void print(){
        System.out.println("Showing Printable Interface");
    }

    public void show(){
        System.out.println("Showing Showable Interface");
    }
}
public class Example2 {
    public static void main(String[] args) {
        Printable p1 = new AB();
        Showable s1 = new AB();
        p1.print();
        s1.show();

    }
}


