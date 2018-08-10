package com.bdi.erp.test;

interface Action{
	public void walk();
	public void sleep();
	public void talk();
}
public class Person implements Action{

	@Override
	public void walk() {
	}

	@Override
	public void sleep() {
	}

	@Override
	public void talk() {
	}
	public void talk(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Action a = new Person();
	}
}
