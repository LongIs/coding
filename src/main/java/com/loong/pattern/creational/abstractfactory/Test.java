package com.loong.pattern.creational.abstractfactory;

/**
 * @description:
 * @author: TaoLong
 * @create: 2018/10/30 20:46
 **/
public class Test {
    public static void main(String[] args) {
        CouresFactory couresFactory = new JavaCouresFactory();
        Article article = couresFactory.getArticle();
        Video video = couresFactory.getVideo();
        article.product();
        video.product();
    }
}
