package jh;

public class Teacher extends Person{
	private  String id;
	private  String name;
	private  int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Teacher() {}
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
	class A{}
	class B extends A{}
	class c extends B{}
	
	
	

