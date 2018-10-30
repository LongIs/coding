package com.loong.pattern.creational.simplefactory;

public class AnimalFatory {
    public Animal getAnimal(Class c){
        try {
            return (Animal) c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
