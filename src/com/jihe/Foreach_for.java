package com.jihe;

public class Foreach_for {
	static String[] strs= {"aaa","bbb","ccc"};
	
	public static void main(String[] args) {
		//foreach循环遍历数组
		for(@SuppressWarnings("unused") String mgys:strs) {
			mgys="ddd";
		}
		System.out.println(strs[0]+" "+strs[1]+" "+strs[2]+" ");
		//for遍历并修改数组中的元素,可以吗？可以
		for(int i=0;i<strs.length;i++) {
			strs[i]="ddd";
		}
		System.out.println(strs[0]+" "+strs[1]+" "+strs[2]+" ");
	}

}
