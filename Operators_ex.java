package javaprograms;

public class Operators_ex {

	public static void main(String[] args) {

		Operators_ex obj=new Operators_ex();
		obj.arithmetic_op();
		
		obj.assignment();
		
		obj.bitwise_op();
		
		obj.logical();
		
		obj.comparison();
		
		obj.unary();
		
	}
	
	
	void arithmetic_op() {
		int a=10,b=15;
		int sum=a+b;
		System.out.println("sum"+sum);
		int pro=a*b;
		System.out.println("mul"+pro);
		int div=a/b;
		System.out.println("Division"+div);
		int mod=b%a;
		System.out.println("Modulo"+mod);
	}
	
	
	void unary() {
		int a=10,b=100;
		System.out.println("pre increment"+ ++a);
		System.out.println("post increment"+ a++);
		System.out.println("Pre decrement"+ --b);
		System.out.println("Post decrement"+ b--);
	}
	
	
	void assignment() {
		int a=15,b=10;
		System.out.println(a+=1);
		System.out.println(b-=2);
		System.out.println(a*=5);
		System.out.println(b/=2);
	}
	
	void logical() {
		boolean a=true,b=false;
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);
	}
	void comparison() {
		int a=15,b=25;
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a>b);
		System.out.println(a>b);
		System.out.println(a==b);
	}
	void bitwise_op() {
		int a = 0b11010110101101011010110110101101;
		int b= 0b11010101;
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(~a);
		System.out.println(a ^ b);

	}

}
