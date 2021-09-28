package com.company;

import java.util.ArrayList;

public class BitcoinInfo implements Subject{
    private ArrayList<Observer> observers;
    private int pri;
    private int market;
    private float change24;
    public BitcoinInfo() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerSubscriber(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeSubscriber(Observer o) {
        int i = observers.indexOf(o);
        if(i >=0)
        {
            observers.remove(i);
        }
    }

    @Override
    public void notifySubscribers() {
        for(Observer observer : observers)
        {
            observer.update(pri,market,change24);
        }
    }
    public void priceChanged()
    {
        notifySubscribers();
    }
    public void setData(int pri,int market,float change24)
    {
        this.pri = pri;
        this.market = market;
        this.change24 = change24;
        priceChanged();
    }
}
