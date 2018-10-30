package com.loong.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCourse(new PythonCourse());
        geely.studyCourse();
    }
}
