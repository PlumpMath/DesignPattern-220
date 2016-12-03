package com.vikas.StrategyPattern;

public class Mute implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("I am mute");
		
	}

}
