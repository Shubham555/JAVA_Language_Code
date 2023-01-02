package CWH_Java;

public class cwh_27_Arrays {

	public static void main(String[] args) {
	/*	float []marks = {98.2f, 78.0f, 67.23f, 45.45f, 70.9f};
		System.out.println(marks.length);
		System.out.println(marks[2]);
        
		String [] students = {"Harry","Rohan","Shubham","Lovish"};
		System.out.println(students.length);
		System.out.println(students[2]);*/
		
		int []marks = {90,45,70,78,60};
		
	/*	for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}*/
		
	/*	for(int i=marks.length-1;i>=0;i--) {
			System.out.println(marks[i]);
		}*/
		
		for(int element:marks) {
			System.out.println(element);
		}
		
	}
}
