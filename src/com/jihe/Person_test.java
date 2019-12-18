package com.jihe;

import java.util.HashSet;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return  name + ":" + age ;
	}

	@Override
	public int hashCode() {
		
		return  name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;	
		return name.equals(other.name);
	}
	
}
public class Person_test {

	public static void main(String[] args) {
		Person p1=new Person("李现",20);
		Person p2=new Person("陈晓",25);
		Person p3=new Person("戚薇",22);
		HashSet<Person> h1=new HashSet<Person>();
		h1.add(p1);
		h1.add(p2);
		h1.add(p3);
		System.out.println(h1);
	}

}
