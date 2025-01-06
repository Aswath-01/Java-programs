package javaprograms;



public class InstanceEx {

 String name;
int age;
String dept;
public void Display(int age,String name,String dept) {
	this.name=name;
	this .age=age;
	this.dept=dept;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceEx o1=new InstanceEx();
		o1.Display(24,"Aswath", "CSE");
		System.out.println(o1.name);
		System.out.println(o1.age);
		System.out.println(o1.dept);
	}

}
