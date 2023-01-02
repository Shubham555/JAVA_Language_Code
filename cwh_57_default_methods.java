package CWH_Java;


interface mycamera{
	void takesnap();
	void recordvideo();
	private void greet() {
		System.out.println("Good Morning....");
	}
	default void record4kvideo() {
		greet(); // We used greet function here, hence we used logic of greet in our this record4kvideo function, which will gives us profit of not add many data in only one record4kvideo function.
		System.out.println("Recording 4k video....");
	}
}

interface mywifi{
	String[] getNetworks();
	void connectTonetworks(String network);
}

class mycellphone{
	void callnumber(int phonenumber) {
		System.out.println("Calling "+phonenumber);
	}
	void pickcall() {
		System.out.println("Connecting.......");
	}
}

class mysmartphonbe extends mycellphone implements mycamera , mywifi{
	public void takesnap() {
		System.out.println("Taking Snap");
	}
	public void recordvideo(){
		System.out.println("Recording Video");
	}
//	public void record4kvideo(){
//		System.out.println("Overriden and Recording 4k video....");
//	}
	public String[] getNetworks() {
		System.out.println("Getting the list of networks.....");
		String[] networklist = {"Harry","Shubham","Om"}; 
		return networklist;
	}
	public void connectTonetworks(String network) {
		System.out.println("Connect to " +network);
	}
}



public class cwh_57_default_methods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mysmartphonbe ms = new mysmartphonbe();
		ms.record4kvideo();
		// ms.greet(); throws error bcoz greet is declared Priavte;
		String [] arr = ms.getNetworks();
		for(String item:arr) {
			System.out.println(item);
		}
	}
}
