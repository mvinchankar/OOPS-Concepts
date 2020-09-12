package com.example.abstraction;

import com.example.abstraction.Animal;
import com.example.abstraction.Transport;

public class Tiger extends Animal implements Transport {
    @Override
    void display() {
        System.out.println("Animal : Tiger");
    }

    @Override
    public void isDeliver() {
        System.out.println("Tiger Delivered !!");
    }
}
