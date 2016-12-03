package com.vikas.StrategyPattern;

public abstract class AbstractDuck {
	
	public FlyBehaviour flybehaviour;
	
	public QuackBehaviour quackbehaviour;
	
	public abstract void display();
	
	public void swim(){
		System.out.println("Hi! I am swimming");
	}
	
	public void fly(){
		flybehaviour.fly();
	}
	
	public void quack(){
		quackbehaviour.quack();
	}
	
	public void setFlyBehaviour(FlyBehaviour fly){
		this.flybehaviour = fly;
	}
	
	public void setQuackBehaviour(QuackBehaviour quack){
		this.quackbehaviour = quack;
	}

}
