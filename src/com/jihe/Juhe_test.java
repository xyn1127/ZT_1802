package com.jihe;

import java.net.SocketImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Juhe_test {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("张三");
		list.add("里斯");
		list.add("张明");
		list.add("李阳");
		list.add("张星");
		//把集合变成流
		Stream<String> liu=list.stream();
		liu.forEach(j->System.out.println(j));
		//过滤
		Stream<String> liu2=list.stream();
		Stream<String> liu3=liu2.filter(k->k.startsWith("张"));
		System.out.println("集合里所有姓张的人:");
		liu3.forEach(j->System.out.println(j));
		
		System.out.println("集合里第二和第三姓张的人:");
		list.stream().filter(k->k.startsWith("张")).skip(1).limit(2).forEach(j->System.out.println(j));
		
		System.out.println("集合里第二和第三个姓张的人用,连接:");
		System.out.println(list.stream().filter(k->k.startsWith("张")).skip(1).limit(2).collect(Collectors.joining(",")));
		
		
	}

}
