package javaprograms;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		Scanner ic=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=ic.nextInt();
		
		PrimeOrNot obj=new PrimeOrNot();
		obj.Prime_chk(num);
		
		

	}
	void Prime_chk(int number) {
		
		int divisor = 0;
		
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				divisor+=1;
			}
		}
		
		if(number==2) {
			System.out.println("2 is prime");
		}
		
		if(divisor<=2) {
			System.out.println("The number"+" "+number+" "+"is a prime number");
		}
	}

}
