package CWH_Java;

public class cwh_33_varargs {
	/*
	public static void foo(int … arr)
	{
	// arr is available here as int[] arr
	}
	*/
	static int add(int...arr) {
		
		int Sum =0;
		int Count = 0;
		for(int a : arr) {
			Sum += a;
			Count++;
		}
		System.out.println(Sum/Count);
		return Sum;
	}
	
	public static void main(String[] args) {
		//System.out.println(add(1,2));
		//System.out.println(add(1,2,3));
		System.out.println(add(1,2,3,4));
	}
}
