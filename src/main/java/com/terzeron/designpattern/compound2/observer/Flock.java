package com.terzeron.designpattern.compound2.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Flock implements Quackable {
	List<Quackable> quackers = new ArrayList<>();
	Observable observable;
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	
	public void quack() {
		Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
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
