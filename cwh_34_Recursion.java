package CWH_Java;

public class cwh_34_Recursion {

	static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	
	static int factorial_iterative(int n){
		if(n==0||n==1) {
			return 1;
		}
		else {
			int product = 1;
			for(int i=1;i<=n;i++) {
				product *= i;
			}
			return product;
		}
	}
	
	public static void main(String[] args) {
		 int n =5;
		 System.out.println(factorial(n));
		 System.out.println(factorial_iterative(n));
	}
}
