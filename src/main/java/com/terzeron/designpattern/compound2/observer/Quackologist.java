package com.terzeron.designpattern.compound2.observer;

public class Quackologist implements Observer {
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " juct quacked.");
	}

}
