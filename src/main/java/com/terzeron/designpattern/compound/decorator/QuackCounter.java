package com.terzeron.designpattern.compound.decorator;

import com.terzeron.designpattern.compound.domain.Quackable;

public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
	
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
}
