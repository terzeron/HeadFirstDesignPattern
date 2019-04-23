package com.terzeron.designpattern.compound2.decorator;

import com.terzeron.designpattern.compound2.observer.Observable;
import com.terzeron.designpattern.compound2.observer.Observer;
import com.terzeron.designpattern.compound2.observer.Quackable;

public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
	Observable observable;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
	
	public static int getQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}
