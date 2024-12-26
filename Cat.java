package javaprograms;
class Animal{
	public void MakeSound() {
		System.out.println("Animal makes sound");
	}
}
public class Cat extends Animal {
	public void MakeSound() {
		System.out.println("Cat Meows");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal o1=new Animal();
		Cat o2=new Cat();
		o1.MakeSound();
		o2.MakeSound();
		
	}

}
