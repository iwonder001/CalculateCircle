import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		//set up continue
		String inputContinue;
		boolean userContinue =true;
		
		//Welcome Statement
		System.out.println("Welcome to the Circle Tester");
		
		//Get user radius input 
		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a radius");
//		String inputRadius = input.nextLine();
		
		//make circle object in the main app to call the methods on
		Circle c = new Circle ();
		
		//set up a loop to output circumference and area after user enters radius
		
		while (userContinue){
			System.out.println("Enter a radius");
			String inputRadius = input.nextLine();
			
			c.getArea();
			
			
			
			
			//As if continue and capture user input
			System.out.println("Continue? (y/n): ");
			/*scanning for an answer. 
			Taking input from the scanner and putting it into inputContinue */
			inputContinue = input.nextLine();
			//
			if(inputContinue.equals("yes")) {
				userContinue = true;
			} else {
				userContinue = false;
			}//if/else loop close
			
		}//close while loop
		
		

	}//close psvm

}//close MainApp class
