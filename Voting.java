package javaprograms;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voting obj=new Voting();
		obj.Check_elegibility();
	}
	public void Check_elegibility() {
		Scanner ic=new Scanner (System.in);
		
	System.out.println("Enter Nationality :");
		String nationality=ic.nextLine();
		
		String nationality_2="Indian";
		
		System.out.println("Enter Age :");
		int age=ic.nextInt();
		
	boolean check_nationality=nationality_2.equalsIgnoreCase(nationality);
	
		if(check_nationality==true) {
			if(age>=18) {
				System.out.println("Congrats you are elegible to vote ");
			}
		}
		else {
			System.out.println("Sorry!! You are not elegible to vote");
		}

		
	}

}
