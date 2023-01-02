package CWH_Java;

class base{
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}

class derived extends base{
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
public class cwh_45_Inheritance {
	public static void main(String[] args) {
		
	//Using Object of base class	
	base b = new base();
	b.setX(5);
	System.out.println(b.getX());
 
	//Using Object of Derived class
	derived d = new derived();
	d.setX(6);
	System.out.println(d.getX());
	d.setY(67);
	System.out.println(d.getY());
	
	}
}
