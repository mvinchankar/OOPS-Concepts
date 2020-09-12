package com.example.abstraction;

public class AnimalTest {

    public static void main(String[] args) {
        Camel camel = new Camel();
        Tiger tiger= new Tiger();
        camel.display();
        tiger.display();
        tiger.isDeliver();
    }
}

