package com.qa;

import java.util.ArrayList;
import java.util.List;

public class TestBooks {
    public static void main(String[] args) {
        String[] arr = {"Mike","Martina", "Peter"};
        Book b1 = new Book("title", arr, 10.99);
        Book b2 = new Book("title2", arr, 5.99);
        Book b3 = new Book("title3", arr, 1.00);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


        Book[] bookArray = new Book[3];

        bookArray[0] = b1;
        bookArray[1] = b2;
        bookArray[2] = b3;

        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i]);
        }

        Dog mydog1 = new Dog("Rex", 3);
        Dog mydog2 = new Dog("Golan", 5);

        List<Dog> myDogList = new ArrayList<>();
        myDogList.add(mydog1);
        myDogList.add(mydog2);

        for (Dog x : myDogList) {
            System.out.println(x);
        }

    }
}
