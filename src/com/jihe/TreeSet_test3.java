package com.jihe;

import java.util.TreeSet;

/*class Mycomparator implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		return s1.length()-s2.length();
	}
}*/
public class TreeSet_test3 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>((o1,o2)->{
			String s1=(String)o1;
			String s2=(String)o2;
			return s1.length()-s2.length();
		});
			ts.add("jack");
			ts.add("Eva");
			ts.add("Serena");
			System.out.println(ts);
	}

}
