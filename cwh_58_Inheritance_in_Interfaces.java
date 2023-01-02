package CWH_Java;


interface mysample {
	 void meth1();
     void meth2();
}
interface mysample2 extends mysample {
     void meth3();
	 void meth4();
}
class Today implements mysample2{
	public void meth1() {
		System.out.println("meth1");
	}
	public void meth2() {
		System.out.println("meth2");
	}
	public void meth3() {
		System.out.println("meth3");
	}
	public void meth4() {
		System.out.println("meth4");
	}
}



public class cwh_58_Inheritance_in_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Today obj = new Today();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
	}
}
