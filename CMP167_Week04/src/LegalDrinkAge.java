/**
 * @author Richard_T.
 * 
*/
import java.util.Scanner;

	public class LegalDrinkAge {
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      String userName;
	      int age;
	            
	      
	      System.out.println("Enter Name: ");
	      userName = scnr.nextLine();
	      System.out.println("Welcome new user: " + userName);
	      System.out.println("Please enter your age:");
	      age  = scnr.nextInt();

	      if (age >= 21) {
	        System.out.println("Legal  Drinking age.");
	      } else {
	        System.out.println("Not Legal Drinking age.");
	      }
	    
	   }
}
