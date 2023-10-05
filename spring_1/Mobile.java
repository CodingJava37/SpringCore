package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {
       // Airtel airtel = new Airtel();//tight coupling
       // Sim sim = new Airtel();// upto some extent loose coupling
        //create factory class
       // ObjectFactory.getAirtelObject().data();
       //ObjectFactory.getAirtelObject().calling();
        //ObjectFactory.getObject("Airtel").calling();
        //BeanFactory

        ApplicationContext container = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("Container created");
        Airtel a = container.getBean("airtel",Airtel.class);
        a.data();
        a.calling();

    }
}
