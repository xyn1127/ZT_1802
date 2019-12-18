package com.api;

public class E54 {

	public static void main(String[] args) {
		String s1="abca我1b3爱c8你b5中a6c国7d6b2a2c4c8.jpg";
		System.out.println("这个字符里的数字是:");
		//将字符串打碎成字符数组
		char[] zfsz=s1.toCharArray();
		//foreach循环:对于字符数组里的每个字符
		//冒号前面是集合或者数组里的单个元素,冒号后面是集合或者数组
		for(char zf: zfsz) {
			if(zf>='0'&&zf<='9') {
				System.out.print(zf);
			}
		}
	    
		System.out.println("\n这个字符里的汉字是:");
		
		
		//foreach循环:对于字符数组里的每个字符
		//冒号前面是集合或者数组里的单个元素,冒号后面是集合或者数组
		for(char zf: zfsz) {
			if(zf>='\u4E00'&&zf<='\u9FA5') {
				System.out.print(zf);
			}
		}
	}

}
