package javaprograms;

import java.util.Scanner;

public class SmallestOf3Num {

	public static void main(String[] args) {

		Scanner ic=new Scanner(System.in);
		
		System.out.println("Enter 3 Numbers:");
		int a=ic.nextInt(),b=ic.nextInt(),c=ic.nextInt();
		
		SmallestOf3Num obj=new SmallestOf3Num();
		obj.SmallestOf3(a,b,c);
		
	}
	
	public void SmallestOf3(int a,int b,int c) {
		
		if(a<b && a<c) {
			System.out.println("The number"+" "+a+" "+"is the smallest among three");

		}
		else if(b<a && b<c) {
			System.out.println("The number"+" "+b+" "+"is the smallest among three");
		}
		
		else {
			System.out.println("The number"+" "+c+" "+"is the smallest among three");

		}
	}
	

}
