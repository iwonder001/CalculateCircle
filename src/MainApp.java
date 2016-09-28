import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// set up continue
		String inputContinue;
		boolean userContinue = true;
		double i =0;
		

		// Welcome Statement
		System.out.println("Welcome to the Circle Tester");

		// Get user radius input
		Scanner input = new Scanner(System.in);

		 /* set up a loop to output circumference and area after user enters
		  radius*/
      
		while (userContinue) {
			 i = Validator.getInt(input, "Enter a radius: ");
			
			// make circle object in the main app to call the methods on
			Circle c = new Circle(i);
			Circle.getObjectCount();

			/* call the getFormattedCircumference method and pass through the
			  circle object*/
			
			System.out.println("Circumference: " + c.getFormattedCircumference());

			/* call the getFormattedArea method and pass through the circle
			  object */
			
			System.out.println("Area: " + c.getFormattedArea());

			// As if continue and capture user input
			System.out.println("Continue? (y/n): ");
			/*scanning for an answer. Taking input from the scanner and putting
			  it into inputContinue*/
			inputContinue = input.nextLine();

			if (inputContinue.equalsIgnoreCase("y")) {
				userContinue = true;
			} else {
				userContinue = false;
				
			} // if/else loop close
				
		} // close while loop

		System.out.println("Goodbye.  You created " + Circle.getObjectCount() + " Circle object(s).");

	}// close psvm

}// close MainApp class
