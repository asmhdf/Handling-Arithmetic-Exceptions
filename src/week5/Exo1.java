package week5;

import java.util.Scanner;

public class Exo1 {

    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter le numérateur : ");

        int numérateur = num1.nextInt();  // Read user input
        
        Scanner num2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter le dénominateur : ");

        int dénominateur = num2.nextInt();
        
        try {
        	float s = (float) numérateur/dénominateur;
        	System.out.println("le résultat est : "+s);
        }
        catch (ArithmeticException e) {
        	System.out.println("Cannot divide by zero.");
        }
    }
}