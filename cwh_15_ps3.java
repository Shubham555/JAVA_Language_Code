package CWH_Java;

public class cwh_15_ps3 {

	public static void main(String[] args) {
		 //Problem 1
		String name = "Jack Parkar";
		name = name.toLowerCase();
		System.out.println(name);
		
        //Problem 2
		String text = "To Lower Case";
		text = text.replace(" ","_");
		System.out.println(text);
		
		//Problem 3
		String letter = "Dear <|Name|>, Thanks a lot";
		letter = letter.replace("<|Name|>","Harry");
		System.out.println(letter);
		
		//problem 4
		String Mystring = "This String Contains Double and  Triple spaces ";
		System.out.println(Mystring.indexOf("  "));
		System.out.println(Mystring.indexOf("   "));
		
		//Problem 5
		String Myletter = "Dear harry,\n\tThis java Course is nice.\n\tthanks!";
		System.out.println(Myletter);
	}

}
