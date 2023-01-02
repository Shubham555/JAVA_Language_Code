package CWH_Java;

class phone{
	
	public void ShowTime() {
		System.out.println("this is 8 am");
	}
	public void on() {
		System.out.println("Turning on phone...");
	}
	
}

class smartphone extends phone{
	public void music() {
		System.out.println("playing music...");
	}
	public void on(){
		System.out.println("turing on Smartphone...  f");
	}
}
public class cwh_49_dynamic_method_dispatch {
	public static void main(String[] args) {
		
	  phone obj = new smartphone(); // yes allowed
	  obj.on();
	 //smartphone obj2 = new phone();  //not allowed
	  
	  obj.ShowTime();
	 //obj.music(); not allowed

	}
}
