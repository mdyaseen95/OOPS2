package org.example.multipleinterfaces;

interface Print{
    void print();
}

interface Show {
    void show();
}

class DC implements Print,Show{
    public void print(){
        System.out.println("Showing Printable Interface");
    }

    public void show(){
        System.out.println("Showing Showable Interface");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        Print p1 = new DC();
        Show s1 = new DC();
        p1.print();
        //s1.show();

    }
}
