package Impl;

import interfaces.QuackBehavior;

public class WhistleQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quack Whistle!");
	}

}
