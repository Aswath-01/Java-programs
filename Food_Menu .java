package javaprograms;

import java.util.Scanner;

public class Food_Menu {

	public static void main(String[] args) {
		Scanner ic=new Scanner(System.in);
		System.out.println("Enter veg or Nonveg");
		String check=ic.next().trim().toLowerCase();
		Food_Menu o1=new Food_Menu();
		o1.VegorNonveg(check);
	}
	public void VegorNonveg(String check) {
		switch(check) {
		case "veg":System.out.println("List of Veg Rice Recipes:\r\n"
				+ "Vegetable Pulao\r\n"
				+ "Lemon Rice\r\n"
				+ "Curd Rice\r\n"
				+ "Tomato Rice\r\n"
				+ "Jeera Rice\r\n"
				+ "Vegetarian Biryani\r\n"
				+ "Khichdi\r\n"
				+ "Coconut Rice\r\n"
				+ "Vegetable Fried Rice\r\n"
				+ "Mushroom Fried Rice");
		break;
		case "nonveg":System.out.println("List of Non-Veg Rice Recipes:\r\n"
				+ "Chicken Biryani\r\n"
				+ "Egg Fried Rice\r\n"
				+ "Prawn Fried Rice\r\n"
				+ "Chicken Pulao\r\n"
				+ "Mutton Biryani\r\n"
				+ "Fish Biryani\r\n"
				+ "Keema Rice\r\n"
				+ "Thai Basil Chicken Fried Rice\r\n"
				+ "Egg Biryani\r\n"
				+ "Chicken Tikka Biryani");
		break;
		default:System.out.println("Plaese enter veg or nonveg");
		}
	}

}
