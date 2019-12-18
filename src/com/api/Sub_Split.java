package com.api;

public class Sub_Split {

	public static void main(String[] args) {
	String string="2019-10-12";
	System.out.println("今天是"+string.substring(8)+"号");
	System.out.println("本月是"+string.substring(5,7)+"月");
	System.out.println("今年是"+string.substring(0,4)+"年");
	//split方法将字符串通过制定的分隔符进行分割，得到一个字符串数组
	String[] zfsz=string.split("-");
	System.out.println("今天是"+zfsz[0]+"年"+zfsz[1]+"月"+zfsz[2]+"日");
	}

}
