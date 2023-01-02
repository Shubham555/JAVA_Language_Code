package CWH_Java;

public class cwh_25_PraticeSet_5 {

	public static void main(String[] args) {
     //Question 1
/*	 int n =4;
     for(int i=n;i>0;i--) {
    	 for(int j=0;j<i;j++) {
    		 System.out.print("*");
    	 }
         System.out.println("\n");
     } */
		
     //Question 2 
 /*  int n = 5;
     int Sum = 0;
     
     for(int i=0;i<n;i++) {
    	Sum = Sum + (2*i);
     }
	System.out.println("Sum of the First n even Numbers is ");
	System.out.println(Sum); */
	
    //Question 3
/*	int n = 5;
	for(int i=1;i<=10;i++) {
	//	System.out.println("5 X "+i+" = "+i*n);
		System.out.printf("%d X %d = %d\n", n, i, n*i);
	}*/
	
	//Question 4
/*	int n = 10;
	for(int i=10;i>=1;i--) {
	//	System.out.println("5 X "+i+" = "+i*n);
		System.out.printf("%d X %d = %d\n", n, i, n*i);
	}*/
	
	//Question 6
	
/*	int n = 7;
	int i= 1;
	int factorial = 1;
	
	while(i<=n) {
		factorial *= i;
		i++;
	}
	System.out.println(factorial);*/
	
/*	int n =7,factorial = 1;
	for(int i=1;i<=n;i++) {
		factorial *= i;
	}
	System.out.println(factorial);*/
	
	//Question 8
		
		int n = 8;
		int sum = 0;
		for(int i=1;i<=10;i++) {
		//	System.out.println("8 X "+i+" = "+i*n);
			System.out.printf("%d X %d = %d\n", n, i, n*i);
			sum += n*i;
		}	
	    System.out.println(sum);
		
		
		
	}
}
