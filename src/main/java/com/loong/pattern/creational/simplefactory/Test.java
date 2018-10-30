package com.loong.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        AnimalFatory fatory = new AnimalFatory();
        Animal animal = fatory.getAnimal(Cat.class);
        animal.eat();
    }
}
