package com.loong.pattern.structural.facade;

public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService;

    public void giftExchange(PointsGift pointsGift){

    }

}
