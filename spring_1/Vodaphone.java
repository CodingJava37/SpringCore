package com.example;

public class Vodaphone implements Sim{
    @Override
    public void calling() {
        System.out.println("Call using Vodaphone..");
    }

    @Override
    public void data() {
        System.out.println("Browse internet using Vodaphone..");
    }
}
