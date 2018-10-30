package com.loong.principle.openclose;

public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getSellPrice(){
        return super.getPrice()*0.8;
    }
}
