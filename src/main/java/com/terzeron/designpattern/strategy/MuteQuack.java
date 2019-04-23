package com.terzeron.designpattern.strategy;

public class MuteQuack implements QuackBehavior {
    public void quack() {
    	System.out.println("조용");
    }
}