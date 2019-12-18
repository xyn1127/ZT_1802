package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai {

	public static void main(String[] args) {
		ArrayList<String>  arrayList=new ArrayList<String>();
		arrayList.add("stud1");
		arrayList.add("stud2");
		arrayList.add("stud3");
		arrayList.add("stud4");
		//arrayList.add(5);
		System.out.println("数组列表arrayList的长度是"+arrayList.size());
		System.out.println("数组列表arrayList的第二个元素是"+arrayList.get(1));
		System.out.println("使用迭代输出每个元素:");
		//使用迭代读取集合中的每个元素
		Iterator<String> diedai=arrayList.iterator();
		//hasNext判断是否有下一个元素
		while(diedai.hasNext()) {
			//next方法读取下一个元素
			String dgys=diedai.next();
			System.out.println(dgys);
		}
		System.out.println("使用foreach循环输出每个元素:");
		for(String mgys:arrayList) {
			System.out.println(mgys);
		}
		System.out.println("使用JDK8的foreach循环输出每个元素:");
		arrayList.forEach(obj->System.out.println(obj));
		
		System.out.println("使用迭代集合对象使用JDK的foreach循环输出每个元素:");
		Iterator<String>  it=arrayList.iterator();
		it.forEachRemaining(obj->System.out.println(obj));
	}

}
