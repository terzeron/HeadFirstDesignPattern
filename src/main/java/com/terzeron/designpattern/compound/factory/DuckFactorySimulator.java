package com.terzeron.designpattern.compound.factory;

import com.terzeron.designpattern.compound.adapter.Goose;
import com.terzeron.designpattern.compound.adapter.GooseAdapter;
import com.terzeron.designpattern.compound.decorator.QuackCounter;
import com.terzeron.designpattern.compound.domain.Quackable;

public class DuckFactorySimulator {

	public static void main(String[] args) {
		DuckFactorySimulator simulator = new DuckFactorySimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck(); 
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("\nDuck Simulator: With Abstract Factory");
		
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}
	
	private void simulate(Quackable duck) {
		duck.quack();
	}

}
