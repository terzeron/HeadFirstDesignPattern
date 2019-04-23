package com.terzeron.designpattern.compound.factory;

import com.terzeron.designpattern.compound.domain.Quackable;

public abstract class AbstractDuckFactory {
	
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();

}
