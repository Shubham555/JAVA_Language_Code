package CWH_Java;

class Employee{
	int Id;
	int Salary;
	String Name;
	
	public void printdetails() {
		System.out.println(Id);
		System.out.println(Name);
	}
	public int getSalary() {
		return Salary;
	}
}


public class cwh_38_OwnCustom_Class {
	public static void main(String[] args) {
	 
		System.out.println("This is our Own Custom Class...!!");
		Employee Harry = new Employee();
		Employee Shubham = new Employee();
		
		Harry.Id = 10;
		Harry.Salary = 100;
		Harry.Name = "NameIsHarry";
		
		Shubham.Id = 20;
		Shubham.Salary = 200;
		Shubham.Name = "NameIsShubham";
		
		Harry.printdetails();
		int H = Harry.getSalary();
		System.out.println(H);
		
		Shubham.printdetails();
		int S = Shubham.getSalary();
		System.out.println(S);
		
	}
}
