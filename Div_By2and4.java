package javaprograms;

import java.util.Scanner;

public class Div_By2and4 {

	public static void main(String[] args) {
Scanner ic=new Scanner(System.in);
System.out.println("Enter any number to check its divisible by 2 & 4");
int num=ic.nextInt();
Div_By2and4 o1=new Div_By2and4();
o1.Div_test(num);

	}
	public void Div_test(int num) {
		if(num%2==0 && num%4==0) {
			System.out.println("The number"+" "+num+" "+"is divisible by 2 & 4.");
		}
		else {
			System.out.println("The number"+" "+num+" "+"is not divisible by 2 & 4.");
		}
	}

}
