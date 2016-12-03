package com.vikas.StrategyPattern;

public class Squeak implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("implementing squeak behaviour");
	}
	

}
