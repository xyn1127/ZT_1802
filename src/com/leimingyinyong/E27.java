package com.leimingyinyong;
@FunctionalInterface
interface _Printable{
	void print(StringUtils su, String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E27 {

	public static void main(String[] args) {
		printUpper(new StringUtils(),"Hello",(object,t)->object.printUpperCase(t));
		printUpper(new StringUtils(),"World",StringUtils::printUpperCase);

	}

	private static void printUpper(StringUtils stringUtils, String string,  _Printable pt) {
		pt.print(stringUtils,string);
		
	}

}
