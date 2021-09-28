package com.company;

public interface Subject {
    public void notifySubscribers();
    public void registerSubscriber(Observer o);
    public void removeSubscriber(Observer o);
}
