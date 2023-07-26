package com.qa.models;

public class Rabbit extends Animal{
    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Rabbit: " + super.toString();
    }

    @Override
    public String move() {
        return "Hop";
    }


}
