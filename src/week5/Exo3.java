package week5;

public class Exo3 {

    public static float parseAndDivide(String num1, String num2){
        try{
            int numérateur = Integer.parseInt(num1);
            int dénominateur = Integer.parseInt(num2);
            float s = (float )numérateur / dénominateur;
            return s;
        }catch (NumberFormatException e){
            System.out.println(" Invalid input. Please enter valid numbers.");
            return 0;

        }catch (ArithmeticException e){
           System.out.println("Cannot divide by zero.");
            return 0;
        }

    }

    public static void main(String[] args) {
    	
    	

        System.out.println("Result: " + parseAndDivide("20", "3"));
        System.out.println("Result: " + parseAndDivide("five", "1"));
        System.out.println("Result: " +  parseAndDivide("15", "0"));
    }
}