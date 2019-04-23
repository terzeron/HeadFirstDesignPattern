package com.terzeron.designpattern.compound.factory;

import com.terzeron.designpattern.compound.decorator.QuackCounter;
import com.terzeron.designpattern.compound.domain.*;

public class CountingDuckFactory extends AbstractDuckFactory {
	
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	} 
	
}
