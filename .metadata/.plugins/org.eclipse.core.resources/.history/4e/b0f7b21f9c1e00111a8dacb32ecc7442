package core;

import java.util.Scanner;

class ABC {
	// without return type without parameter
	public void abcClassMethod() {
		System.out.println("abc class method");
	}

	// without return type with parameter
	public void call(double a) {
		System.out.println("without return type with parameter : " + a);
	}
	// with return type without parameter
	public int getNumber() {
		System.out.println("with return type without parameter");
		return 123;
	}
	// with return type with parameter
	
	public int getSquare(int num) {
		System.out.println(num+" is coming from main method");
		return num*num;
	}
	
}

public class P008_ClassObjectFunctions {
	public static void main(String[] args) {
		System.out.println("main method");
		ABC a = new ABC();
		a.abcClassMethod();
		
		a.call(456.46);
		
		int res = a.getNumber();
		System.out.println(res);
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter num to get sqwaure : ");
		int num = sc.nextInt();
		
		int sq =  a.getSquare(num);
		System.out.println("square of "+num+" is "+sq);
	}
}
