package javaprograms;

import java.util.Scanner;

public class Sum_EvenandOdd {

	public static void main(String[] args) {
Sum_EvenandOdd o1=new Sum_EvenandOdd();
o1.Sum();
	}
	public void Sum() {
		int even_sum=0;
		int odd_sum=0;
		
	int i=1;
	while(i<=20) {
		if(i%2==0) {
			even_sum+=i;
		}
		else {
			odd_sum+=i;
		}
		i++;
	}
	System.out.println("The sum of all even numbers between 1 to 20 is :"+even_sum);
	System.out.println("The sum of all odd numbers between 1 to 20 is :"+odd_sum);

		
	}
	

}
