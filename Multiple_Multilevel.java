package javaprograms;
//Multiple and multilevel inheritance Example

interface A1 {
	void display1();
}

interface B1{
	void display2();
}

class D1{
	void display() {
		System.out.println("Hi from class D1");
	}
}

class D2 extends D1{
	void display(){
		System.out.println("Inherited from D1 ,Hi from D2");
	}
}
class D3 extends D2{
	void display() {
		System.out.println("Inherited from D2,Hi from D3");
	}
}


public class Multiple_Multilevel extends D3 implements A1,B1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_Multilevel obj = new Multiple_Multilevel();
		obj.display1();
		obj.display2();
		obj.display();

		D1 d1 = new D1();
		d1.display();

		D2 d2 = new D2();
		d2.display();

		D3 d3 = new D3();
		d3.display();
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Hi from interface A");
	}
	
	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Hi from interface B");

	}

}
