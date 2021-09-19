package org.example.finalvariable;

class Student {
    final int roll_no;

    Student ( int roll_no){
        this.roll_no = roll_no;
    }

    void display(){
        System.out.println("Roll num of Student is " +roll_no);
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        Student s1 = new Student( 15);
        Student s2 = new Student(16);
        s1.display();
        s2.display();
    }
}
