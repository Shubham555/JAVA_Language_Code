package CWH_Java;

class A{
	int a;
	
	public int meth1() {
		return 4;
	}
	public void meth2() {
		System.out.println("I am method 2 of Class A");
	}
}

class B extends A{
	@Override
	public void meth2() {
		System.out.println("I am method 2 of Class B");
	}
	// @Override
	public void meth3() {
		System.out.println("I am method 3 of Class B");
	}
}

public class cwh_48_Method_Overriding {
	public static void main(String[] args) {
	    
		A  a = new A();
		a.meth2();
		
		B b = new B();
		b.meth2();
		
	}
}
