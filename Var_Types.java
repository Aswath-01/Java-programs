package javaprograms;

import java.util.Scanner;

public class Var_Types {
static int a=10,c=12,d;
String Greet="Hi !! This is a java program that implements types of variables.";//instance variable
	public static void main(String[] args) {
//Scanner ic=new Scanner(System.in);
Var_Types obj=new Var_Types();
System.out.println(obj.Greet);
Var_Types.add();
obj.Sqr();
	}
	void Sqr() {
		int c,square;//local variable
		Scanner ig=new Scanner(System.in);
		System.out.println("Enter the value of 'c' for square of a num:");
		c=ig.nextInt();
		square=c*c;
		System.out.println(square);
	}
	static void add() {
		//implements Static variable
		d=a+c;
		System.out.println("Sum="+d);
	}
	

}
