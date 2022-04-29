package com.fju.order;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;

    public Order(int amount, Delivery delivery,int shipFeed) {
        this.amount = amount;
        this.delivery = delivery;
        this.shipFeed = shipFeed;
    }

    public Order(int amount, Delivery shopee) {

    }

    public int total(){
        return amount+shipFeed;
    }
}
