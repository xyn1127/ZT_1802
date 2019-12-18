package com.jihe;

import java.util.ArrayList;
import java.util.HashSet;

public class Set_test {

	public static void main(String[] args) {
		ArrayList<String>  arrayList=new ArrayList<String>();
		arrayList.add("stud1");
		arrayList.add("stud2");
		arrayList.add("stud3");
		arrayList.add("stud4");
		System.out.println("来自数组列表的输出");
		arrayList.forEach(obj->System.out.println(obj));
		
//HashSet能够去掉重复元素,是因为HashSet里的String类已经重写了Object类的hashCode()以及equals()
		HashSet<String> hset=new HashSet<String>();
		hset.add("jack");
		hset.add("Eva");
		hset.add("pete");
		hset.add("Rose");
		hset.add("Rose");
		System.out.println("来自哈希集的输出");
		hset.forEach(obj->System.out.println(obj));
		
//HashSet能够去掉重复元素,是因为HashSet里的Integer类已经重写了Object类的hashCode()以及equals()
		hset.removeAll(hset);
		hset.add("4");
		hset.add("1");
		hset.add("2");
		hset.add("3");
		hset.add("5");
		System.out.println("来自哈希集的输出");
		hset.forEach(obj->System.out.println(obj));
	}

}
