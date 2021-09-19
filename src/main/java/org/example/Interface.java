package org.example;

interface Myinterface {
    int num = 100;
    void display();
}

class Interfacexample implements Myinterface{

    public static int num = 2000;
    public void display(){
        System.out.println("Implementing method of Myinterface");
    }
}
public class Interface{
    public static void main(String[] args) {
        Myinterface my = new Interfacexample();
        my.display();
        System.out.println("Value of number from interface class " +my.num);
        System.out.println("Value of num from Interfaceexample class " +Interfacexample.num);
    }
}
