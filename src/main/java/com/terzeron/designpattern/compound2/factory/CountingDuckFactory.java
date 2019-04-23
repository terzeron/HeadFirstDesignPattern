package com.terzeron.designpattern.compound2.factory;

import com.terzeron.designpattern.compound.domain.DuckCall;
import com.terzeron.designpattern.compound.domain.RedheadDuck;
import com.terzeron.designpattern.compound.domain.RubberDuck;
import com.terzeron.designpattern.compound2.decorator.QuackCounter;
import com.terzeron.designpattern.compound2.observer.MallardDuck;
import com.terzeron.designpattern.compound2.observer.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
}
