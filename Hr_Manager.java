package javaprograms;
class Employee{
	public void work(String emp) {
		System.out.println("Employee"+emp);
}
	public void getsalary(int salary) {
		System.out.println("Salary:"+salary);
	}
}
public class Hr_Manager {
public void work(String emp) {
	System.out.println("Employee role"+emp);
}
void addEmployee(String name,int emp_id) {
	System.out.println("Employee name:"+name);
	System.out.println("Employee_id:"+emp_id);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hr_Manager o1=new Hr_Manager();
		Employee o2=new Employee();
		o1.work("HR Manager");
		o1.addEmployee("Aswath", 2126);
		o2.getsalary(700000);

	}

}
