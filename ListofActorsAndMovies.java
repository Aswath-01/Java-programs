package javaprograms;

import java.util.Scanner;

public class ListofActorsAndMovies {


	public static void main(String[] args) {

		Scanner ic=new Scanner(System.in);
ListofActorsAndMovies o1=new ListofActorsAndMovies();
System.out.println("Enter the name of the actor 1.Ajith"+" "+"2.Vijay"+" "+"3.Rajinikanth"+" "+"4.Shah Rukh Khan");

String actor=ic.nextLine().toLowerCase().trim();

o1.Movie_List(actor);

	}
	
	public void Movie_List(String actor_name) {
		
		switch(actor_name){
			
		case "vijay" :
			System.out.println("G.O.A.T");
			System.out.println("Varisu");
			System.out.println("Leo");
			System.out.println("Beast");
			break;
			
		case "ajith":
			 System.out.println("Thunivu");
             System.out.println("Valimai");
             System.out.println("Nerkonda Paarvai");
             System.out.println("Viswasam");
             break;
             
		case "rajinikanth":
			 System.out.println("Jailer");
             System.out.println("Annaatthe");
             System.out.println("Darbar");
             System.out.println("Petta");
             break;
             
		case "shahrukhkhan":
			 System.out.println("Pathan");
             System.out.println("Jawan");
             System.out.println("Tiger 3");
             break;
		}
	}

	

}
