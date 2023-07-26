package com.qa.models;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Dog: " + super.toString();
    }

    @Override
    public String move() {
        return "Ruuuuuuuuun!";
    }



}
