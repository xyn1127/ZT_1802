package com.class_cast;



interface Animal{
	void shout();
	
}
class Tiger implements Animal{

	@Override
	public void shout() {
		System.out.println("aow......");
		
	}

	public void eatsheep() {
	System.out.println("老虎吃羊");
		
	}
	
}
class Pig implements Animal{

	@Override
	public void shout() {
		System.out.println("henheng.....");
		
	}
	
}
public class E15 {

	public static void main(String[] args) {
		Animal an1=new Pig();
		if (an1 instanceof Tiger) {
			Tiger tiger=(Tiger) an1;
			tiger.shout();
			tiger.eatsheep();
		}else
		{System.out.println("这个动物不是老虎");

	}
	
	}
}
