package com.example;


public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling using Airtel..");
    }

    @Override
    public void data() {
        System.out.println("Data through Airtel");
    }
}
