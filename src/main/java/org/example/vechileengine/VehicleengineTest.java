package org.example.vechileengine;

interface Vehicle {
    String engine();
    int Stroke();
}
class Vechileengine implements Vehicle {
    public String engine(){
        return "Petrol";
    }


   public int Stroke(){
        return 2 ;
    }
}

public class VehicleengineTest {
    public static void main(String[] args) {
        Vehicle rx = new Vechileengine();
        System.out.println("Engine type and Stroke " + rx.engine() + " and Stroke is  " + rx.Stroke());
    }
}

