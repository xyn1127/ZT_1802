package com.api;

public class Array_copy {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int b[]= {6,728,92,40,15,70};
	System.arraycopy(a, 2, b, 0, 4);
	for(int i = 0; i < b.length; i++ ) {
		System.out.println(b[i]);
	}

	}

}
