package CWH_Java;

public class cwh_35_Pratice_Set_Method {
	
    //Problem 3
	// Sum(n) = Sum(n-1) + n;
	// Sum(3) = 3 + Sum(2);
	// Sum(3) = 3 + 2 + Sum(1);
	// Sum(3) = 3 + 2 + 1;
/*	static int SumRec(int n) {
		if(n==1) {
			return 1;
		}
		return n + SumRec(n-1);
	}*/
	
	//Problem 8
/*	static void pattern1_rec(int n) {
		if(n>0) {
			pattern1_rec(n-1);
			for(int i=0;i<n;i++) {
				System.out.print("*");
			}
		    System.out.println();
		}
	}*/
	
	//Problem 9
	static float CalToFar(int n) {
		
		return ( n * (9/5f) ) + 32 ;
	}
	
	
	public static void main(String[] args) {
       //Problem 3
	   //	int c =SumRec(4);
	   //	System.out.println(c);
		
	   //Problem 8
		// pattern1_rec(3);
		
	   //problem 9
		System.out.println("temperature in Fahrenheit "+CalToFar(4));
	  	
	}
}
