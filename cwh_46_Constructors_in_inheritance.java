package CWH_Java;

class base1{
	base1(){
		System.out.println("I am a constructor");
	}
	base1(int x){
		System.out.println("I am an overloaded constructor with value of x as: " + x);
	}
}

class derived1 extends base1{
	derived1(){
		System.out.println("I am a derived class constructor");
	}
	derived1(int x,int y){
		super(x);
		System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
	}
}

class childofderived extends derived1{
	childofderived(){
		 System.out.println("I am a child of derived constructor");
	}
	childofderived(int x,int y,int z){
		super(x,y);
		System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
	}
}

public class cwh_46_Constructors_in_inheritance {
	public static void main(String[] args) {
         // base1 b = new base1();
		 // base1 b = new base1(5);
		 // derived1 d = new derived1();
		 // derived1 d = new derived1(4,5);
		 // childofderived cd = new childofderived();
		    childofderived cd = new childofderived(4,5,6);
	}
}
