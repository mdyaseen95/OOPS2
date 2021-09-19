package org.example;

public class StaticKey {

    static int cube(int x){
        return x * x * x;
    }

    public static void main(String[] args) {
        int result = StaticKey.cube(8);
        System.out.println(result);
    }
}
