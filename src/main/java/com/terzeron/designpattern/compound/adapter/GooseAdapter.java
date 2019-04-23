package com.terzeron.designpattern.compound.adapter;

import com.terzeron.designpattern.compound.domain.Quackable;

public class GooseAdapter implements Quackable {
	Goose goose;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
	public void quack() {
		goose.honk();
	}
}
