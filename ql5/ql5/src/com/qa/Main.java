package com.qa;
import com.qa.models.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Cat c = new Cat("Whiskers", 10);
       Cat c2 = new Cat("Midas", 8);
       Dog d = new Dog("Spot", 2);
       Rabbit r = new Rabbit("Peter", 2);
       Rabbit r2 = new Rabbit("Cottontail", 3);

        ArrayList<Animal> animalList = new ArrayList<Animal>();

        animalList.add(c);
        animalList.add(c2);
        animalList.add(d);
        animalList.add(r);
        animalList.add(r2);

        for (Animal a : animalList) {
            System.out.println(a);
        }


        HashMap<String, Animal> animalMap = new HashMap<String, Animal>();
        animalMap.put(c.getName(), c);
        animalMap.put(c2.getName(), c2);
        animalMap.put(d.getName(), d);
        animalMap.put(r.getName(), r);
        animalMap.put(r2.getName(), r2);

        HashMap<Animal, String> animalMap2 = new HashMap<Animal, String>();


         animalMap2.put(c, "Fluffy");
        animalMap2.put(c2, "Doesn't like being picked up");
       animalMap2.put(d, "Overly excited about running");
        animalMap2.put(r, "Snuffles a lot, may have a cold");
         animalMap2.put(r2, "May actually be evil. Unsure.");


         for (String key : animalMap.keySet()) {
             System.out.println("Key: " + key + " Valuea: " + animalMap.get(key));
         }
        HashSet<Animal> set = new HashSet<>();
         set.addAll(animalList);
         set.add(c);
         set.add(c2);

        Iterator<Animal> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        System.out.println("Finding spot");

        for (Animal a : animalList) {
            if (a.getName().equals("spot")) {
                System.out.println("Fount Spot in the ArrayList: " + a);
            }
        }

        System.out.println("for hashmap" + animalMap.get("Spot"));
        Collections.sort(animalList);

        for (Animal a : animalList) {
            System.out.println(a);
        }


        TreeMap<String, Animal> tree =new TreeMap<>();
        tree.putAll(animalMap);

        System.out.println("tree");

        for (String key : tree.keySet()) {
            System.out.println("key: " + key + "valuea: " + tree.get(key));
        }
    }
}