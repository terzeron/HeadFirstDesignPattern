package com.terzeron.designpattern.compound.composite;

import com.terzeron.designpattern.compound.adapter.Goose;
import com.terzeron.designpattern.compound.adapter.GooseAdapter;
import com.terzeron.designpattern.compound.decorator.QuackCounter;
import com.terzeron.designpattern.compound.domain.Quackable;
import com.terzeron.designpattern.compound.factory.AbstractDuckFactory;
import com.terzeron.designpattern.compound.factory.CountingDuckFactory;

public class DuckCompositeSimulator {

	public static void main(String[] args) {
		DuckCompositeSimulator simulator = new DuckCompositeSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck(); 
		Quackable gooseDuck = new GooseAdapter(new Goose());

		// 꽥소리가 나는 모든 것들
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		// 물오리떼
		Flock flockOfMallards = new Flock();
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfDucks);
		
		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);
		
		System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
	}
	
	private void simulate(Quackable quackable) {
		quackable.quack();
	}

}
