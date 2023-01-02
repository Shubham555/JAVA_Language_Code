package CWH_Java;
import java.util.Scanner;

class Game{
	int NoOFGuesses = 0;
	int Number;
	int NumberGivenUser;
	public Game(){
	    Number = 8;
	}
	public void TakeUSerInput(int x){
		NumberGivenUser = x;
	}
	public void IsCoorectNumber(){
		if(Number==NumberGivenUser) {
			NoOFGuesses++;
			System.out.println("No of Guesses taken by user: "+NoOFGuesses);
		}
		else if(Number<NumberGivenUser){
			System.out.println("Your Number is Greater..!!");
			NoOFGuesses++;
		}
		else{
			System.out.println("Your Number is Smaller..!!");
			NoOFGuesses++;
		}
	}
}


public class cwh_43_Exercise3_GuessTheNumber {
	
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Number ");
       int num = sc.nextInt();
       
       Game G1 = new Game();
       G1.TakeUSerInput(num);
       G1.IsCoorectNumber();
       
	}
}
