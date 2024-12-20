package javaprograms;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddorEven o1=new OddorEven();
		Scanner ic=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=ic.nextInt();
		o1.Check_num(num);
	}
	void Check_num(int number) {
		if(number%2==0) {
			System.out.println("The number"+" "+number+" "+" is a even number");
		}
		else {
			System.out.println("The number"+" "+number+" "+"is a odd number ");
		}
	}

}
