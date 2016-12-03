package com.vikas.StrategyPattern;

public class SimUTest {
	
	public static void main(String[] args){
		MallardDuck md = new MallardDuck();
		md.setFlyBehaviour(new FlyWithWIngs());
		md.setQuackBehaviour(new Squeak());
		RubberDuck rd = new RubberDuck();
		rd.setFlyBehaviour(new CantFly());
		rd.setQuackBehaviour(new Mute());
		md.display();
		md.fly();
		md.quack();
		rd.display();
		rd.fly();
		rd.quack();
	}

}
