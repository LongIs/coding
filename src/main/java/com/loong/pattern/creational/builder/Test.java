package com.loong.pattern.creational.builder;

/**
 * @description:
 * @author: TaoLong
 * @create: 2018/10/30 21:57
 **/
public class Test {
    public static void main(String[] args) {
        Coures coures = new Coures.CourseBuilder().courseName("张三").coursePPT("ppt").courseVideo("java").courseQA("qa").courseArticle("1").build();
        System.out.println(coures);
    }
}
