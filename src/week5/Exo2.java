package week5;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException() {        
    }
}
public class Exo2{
	  public static void checkAge(int age) throws InvalidAgeException {
		  
		    if (age < 18) {
		      throw new InvalidAgeException();
		    }
		    else {
		      System.out.println("Access granted - You are old enough!");
		    }
		  }
	  public static void main(String[] args) {
			try {
			    Scanner num = new Scanner(System.in);  // Create a Scanner object
			    System.out.println("Enter your age");

			    int age = num.nextInt();
			    Exo2.checkAge(age);
			
			}
			catch (InvalidAgeException e) {
				System.out.println("Access denied - You must be at least 18 years old.");
			}
	  }
}

