package CWH_Java;

public class cwh_31_Methods {
    
	static int Sumlogic(int x,int y) {
		int z;
		if(x>y) {
			z = x+y;
		}
		else{
			z = (x+y)*5;
		}
		x = 566;y= 567;//updated
		return z; //returned to int:)
	}
	
	public static void main(String[] args) {
     int a=5;
     int b=7;
     int c = Sumlogic(a,b);
     System.out.println(c);
     System.out.println(a+","+b);
     
     int a1=2;
     int b1=1;
     int c1 = Sumlogic(a1,b1);
     System.out.println(c1);
     System.out.println(a1+","+b1);
     
	}
}
