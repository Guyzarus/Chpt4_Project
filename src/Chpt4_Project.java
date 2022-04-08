import java.util.Scanner;

/*
 *
 * 
 * 
 */

public class Chpt4_Project {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//Define length, width and height and prompt the user to enter inputs
		System.out.print("Enter rectangle length (inches): ");
		double length = input.nextDouble();
		System.out.print("Enter rectangle width (inches): " );	
		double width = input.nextDouble();
		System.out.print("Enter rectangle height (inches): ");
		double height = input.nextDouble();
		
		//Enter in formula for volume 
		double volume = length * width * height;
		
		//Calculate volume and print volume result rounded by two decimals
		System.out.printf("The volume for a cube " + length + " " + "inches long," + " " + width + " " + "inches wide," 
				+ " " + "and" + " " + height + " " +  "inches tall is:" + " " + String.format("%.2f", volume) + " " + "cubic inches");

		//End of Program
		
		
		
		
		
		
		

	}

}
