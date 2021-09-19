package org.example;

//Interface Method Visibility
interface Bank{
    float rateofinterest();
}

class Canara implements Bank {

    public float rateofinterest() {
        return 7.2f;
    }
}

class PBI implements Bank{

    public float rateofinterest(){ return 8.5f; }
}

public class InterfaceMethodVisibility {
    public static void main(String[] args) {
        Bank b1 = new Canara();
        Bank b2 = new PBI();
        System.out.println("Rate of Interests of SBI and PBI are " +b1.rateofinterest()+"%" +"and" +"  " + b2.rateofinterest()+"%");
    }
}
