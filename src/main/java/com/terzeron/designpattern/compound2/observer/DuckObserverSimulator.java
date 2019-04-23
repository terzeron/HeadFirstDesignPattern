package com.terzeron.designpattern.compound2.observer;

import com.terzeron.designpattern.compound2.decorator.QuackCounter;
import com.terzeron.designpattern.compound2.factory.AbstractDuckFactory;
import com.terzeron.designpattern.compound2.factory.CountingDuckFactory;

public class DuckObserverSimulator {

	public static void main(String[] args) {
		DuckObserverSimulator simulator = new DuckObserverSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		Flock flockOfDucks = new Flock();

		Flock flockOfMallards = new Flock();
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		
		flockOfDucks.add(flockOfMallards);

		System.out.println("\nDuck Simulator: With Observer");
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		
		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfDucks);
		
		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}
	
	private void simulate(Quackable quackable) {
		quackable.quack();
	}

}
