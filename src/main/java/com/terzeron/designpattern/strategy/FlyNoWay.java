package com.terzeron.designpattern.strategy;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
    	System.out.println("못 날아요.");
    }
}