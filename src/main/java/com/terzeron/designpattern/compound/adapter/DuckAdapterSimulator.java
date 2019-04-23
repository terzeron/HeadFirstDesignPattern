package com.terzeron.designpattern.compound.adapter;

import com.terzeron.designpattern.compound.domain.*;

public class DuckAdapterSimulator {

	public static void main(String[] args) {
		DuckAdapterSimulator simulator = new DuckAdapterSimulator();
		simulator.simulate();
	}

	private void simulate() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("\nDuck Simulator");
		
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
	}
	
	private void simulate(Quackable quackable) {
		quackable.quack();
	}

}
