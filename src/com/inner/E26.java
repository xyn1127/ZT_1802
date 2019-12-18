package com.inner;
@FunctionalInterface
interface  PersonBuilder{
	Person buildPerson(String name);
}
class Person{
	private String name;

	public String getName() {
		return name;
	}

	public Person(String name) {
	this.name = name;
	}

		
}
public class E26 {
	public static void main(String[] args) {
		printerName("迪丽热巴",name->new Person(name));
		printerName("杨颖",Person::new);
		}

	private static void printerName(String name, PersonBuilder pb) {
		System.out.println(pb.buildPerson(name).getName());
		
	}

	
}
