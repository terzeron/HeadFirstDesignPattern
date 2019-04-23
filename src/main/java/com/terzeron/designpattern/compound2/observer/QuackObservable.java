package com.terzeron.designpattern.compound2.observer;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();

}
