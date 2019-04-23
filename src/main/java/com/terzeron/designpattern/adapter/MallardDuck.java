package com.terzeron.designpattern.adapter;

public class MallardDuck implements Duck {
	public final void quack() {
		System.out.println("Quack");
	}
	public final void fly() {
		System.out.println("I'm flying");
	}
}
