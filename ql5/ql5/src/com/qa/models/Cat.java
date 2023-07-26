package com.qa.models;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Cat: " + super.toString();
    }

    @Override
    public String move() {
        return "If you insist..";
    }


}
