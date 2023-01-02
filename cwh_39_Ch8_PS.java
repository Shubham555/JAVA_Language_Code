package CWH_Java;

class Employee1{
	int Salary;
	String Name;
	
	public int getSalary(){
		return Salary;
	}
	public String getName() {
		return Name;
	}
	public void setName(String n) {
		Name = n;
	}
}

class CellPhone{
	public void ring() {
		System.out.println("Ringing....");
	}
	public void vibrate() {
		System.out.println("Vibrating....");
	}
	public void CallFriend() {
		System.out.println("Calling Mukul....");
	}
}

class Square{
	int Side;
	
	public void setSide(int n) {
		Side = n;
	}
	public int Area(){
		int area = Side*Side;
		return area;
	}
	public int Perimeter() {
		int perimeter = 4*Side;
		return perimeter;
	}
}

class Tommy{
     
	public void Hit() {
		System.out.println("Hitting.....");
	}
	public void Run() {
		System.out.println("Running.....");
	}
	public void Fire() {
		System.out.println("Firing.....");
	}
	
}


public class cwh_39_Ch8_PS {
	public static void main(String[] args) {
		
	/*	//Problem 1
		Employee1 Shubham = new Employee1();
		Shubham.Salary = 250;
		Shubham.setName("NameIsShubham");
		
		System.out.println(Shubham.getSalary());
		System.out.println(Shubham.getName());
		
		//Problem 2
		CellPhone Poco = new CellPhone();
		Poco.ring();
		Poco.vibrate();
		Poco.CallFriend();  
		
		//Problem 3
		Square S = new Square();
		S.setSide(5);
		System.out.println(S.Area());
		System.out.println(S.Perimeter());  */
		
		//Problem 5
		Tommy Player1 = new Tommy();
		Player1.Hit();
		Player1.Run();
		Player1.Fire();
		
	}
}
