package com.duotai;
abstract class Animal{
	abstract void shout();
}
class Dog extends Animal{

	@Override
	void shout() {
		System.out.println("汪汪.....");
		
	}
	
}
class Cat extends Animal{

	@Override
	void shout() {
		System.out.println("喵喵.....");
		
	}
	
}
public class E14 {

	public static void main(String[] args) {
		Animal dog=new Dog();
		Animal cat=new Cat();
		dog.shout();
		cat.shout();
	}

}
