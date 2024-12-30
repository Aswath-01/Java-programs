package javaprograms;

interface Shapes_area{
	void getArea();
	public final  int b=10,l=12,h=6,r=7;

}

class Triangle implements Shapes_area{
	double  area;
	public void getArea() {
area=0.5*(b*h);
System.out.println("The area of Triangle:"+" "+area);
	}
}

class Circle implements Shapes_area{

	@Override
	public void getArea() {
double area=3.14*(r*r);	

System.out.println("the area of  circle :"+" "+area);
	}
	
}

class Rect implements Shapes_area{

	@Override
	public void getArea() {
int area=(l*b);
System.out.println("The area of rectangle is :"+" "+area);
	}
	
}


public class InterfaceEx_Areas {

	public static void main(String[] args) {
		Triangle t1=new Triangle();
		Circle c1=new Circle();
		Rect r1=new Rect();
		
		
		t1.getArea();
		c1.getArea();
		r1.getArea();
	}

}
