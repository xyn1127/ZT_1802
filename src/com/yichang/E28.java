package com.yichang;

public class E28 {

	public static void main(String[] args) {
		try {
			int  result=divide(4,0);
	        System.out.println(result);
			
		} catch (Exception e) {
			System.out.println("捕获运行时的异常信息"+e.getMessage());
		}
	

	}
	private static int divide(int x,int y) {
		int result=x/y;
		return result;
	}

}
