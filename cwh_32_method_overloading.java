package CWH_Java;

public class cwh_32_method_overloading {
       
	   static void foo() {
		   System.out.println("Good Morning Bro");
	   }
	
	   static void foo(int a) {
		   System.out.println("Good Morning "+a+" Bro");
	   }
	   
	   static void foo(int a,int b) {
		   System.out.println("Good Morning "+a+" Bro");
		   System.out.println("Good Morning "+b+" Bro");
	   }
	   
	   static void Change(int []arr) {
		   arr[0] = 98;
	   }
	  
	   static void joke() {
	    	  System.out.println("I invented a new Word!\n"+"Plagiarism!");
	      }
	   
	public static void main(String[] args) {
     
	   joke();
       int []marks = {78,90,45,67,40};
       Change(marks);
       System.out.println(marks[0]);
       
       //Method Overloading
     //  foo();
       foo(3000);
     //(3000,4000);
       
	}
}
