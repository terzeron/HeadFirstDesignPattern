package com.terzeron.designpattern.command;

public class Light {
	private String location = "";
	
	public Light(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println(location + ": The light is turned on.");
	}
	
	public void off() {
		System.out.println(location + ": The light is turned off.");
	}
}
