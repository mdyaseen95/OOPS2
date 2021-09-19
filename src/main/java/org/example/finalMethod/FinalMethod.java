package org.example.finalMethod;

class ABC {
    final void display(){
        System.out.println("This is ABC block ");
    }
}

class EFG extends ABC {
    /*void display(){
        System.out.println("This is EFG block");
    }*/}
public class FinalMethod {
    public static void main(String[] args) {
        EFG obj = new EFG();
        obj.display();
    }
}
