package com.example;

public class ObjectFactory {

    public static Sim getObject(String simProvider) {
        if (simProvider.equals("Airtel")) {
            return new Airtel();
        }
        return new Airtel();
    }
}
