package com.company;

public class PriceRightNow implements Observer,Display{
    private int pri;
    private int market;
    private Subject coinInfo;
    public PriceRightNow(Subject coinInfo) {
        this.coinInfo = coinInfo;
        coinInfo.registerSubscriber(this);
    }
    public void update(int pri,int market,float change24){
        this.pri = pri;
        this.market = market;
        display();
    }
    public void display(){
        System.out.println("Price of Bitcoin is:" + pri
                + ",market capitalization is: " + market);
    }
}
