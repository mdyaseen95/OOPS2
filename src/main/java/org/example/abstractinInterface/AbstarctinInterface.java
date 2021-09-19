package org.example.abstractinInterface;

interface Student{
    void learning();
    void coding();
    void teaching();
}
abstract class BridgeLabz implements Student{
    public void learning(){
        System.out.println("Learning Java");
    }

    public void coding(){
        System.out.println("Coding on Intellij");
    }
}

class laterals extends BridgeLabz{
    public void teaching(){
        System.out.println("Laterals are learning to teach");
    }
}
public class AbstarctinInterface {
    public static void main(String[] args) {
        laterals l1 = new laterals();

        l1.learning();
        l1.coding();
        l1.teaching();
    }
}
