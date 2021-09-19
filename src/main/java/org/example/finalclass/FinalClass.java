package org.example.finalclass;

final class ABC {
    void display(){
        System.out.println("Class ABC is Final ");
    }

}

/*class XYZ extends ABC {
    void show(){
        System.out.println("Class XYZ ");
    }
} */
public class FinalClass {
    public static void main(String[] args) {
        ABC x1 = new ABC();
        x1.display();

    }
}//error:cannot inherit from final org.example.finalclass.ABC
