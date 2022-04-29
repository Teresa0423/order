package com.fju.order;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;
    int total;

    public Order(int amount, Delivery delivery,int shipFeed,int total) {
        this.amount = amount;
        this.delivery = delivery;
        this.shipFeed = shipFeed;
        this.total = total;
    }

    public Order(int amount, Delivery shopee) {

    }

    public int total(){
        return amount+shipFeed;
    }
}
