package com.loong.pattern.creational.abstractfactory;

/**
 * @description:
 * @author: TaoLong
 * @create: 2018/10/30 20:43
 **/
public class JavaCouresFactory implements CouresFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
