package com.loong.pattern.structural.facade;

public class Test {
    public static void main(String[] args) {
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(new PointsGift());
    }
}
