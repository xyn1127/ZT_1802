package com.api;

public class E53 {

	public static void main(String[] args) {
		String s1="abcabcbacdba.jpg";
		if(s1.startsWith("a")){
			System.out.println("字符串s1以a开头");
		}
		if(s1.endsWith("jpg")){
			System.out.println("字符串s1以jpg结尾");
		}
		if(s1.contains("cba")){
			System.out.println("字符串s1包含cba这个字串");
		}
		if(!s1.isEmpty()){
			System.out.println("字符串s1不是空的");
		}
		char[] zfsz=s1.toCharArray();
		for(int i=0;i<zfsz.length;i++) {
			char c=zfsz[i];
			if(i==zfsz.length-1) {
				System.out.println(c);
			}else
				System.out.println(c+",");
		}
	}

}
