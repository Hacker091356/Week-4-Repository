//imports
import java.util.Scanner;
import java.lang.Math;
//Starting the program
public class DivMod {
    public static void main(String[] args){
    //initializing the scanner
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    double num1 = userInput.nextDouble();
    System.out.print("Enter a second integer: ");
    double num2 = userInput.nextDouble();
    // CLosing the scanner to avoid wasting resources
    userInput.close();
    //Doing the operations (modulus)
    double mod = num1 % num2;
    double mod2 = num2 * num1;
    //Doint the floor division
    double floor1 = Math.floor(num1/num2);
    double floor2 = Math.floor(num2/num1);
    //Printing results
    System.out.println(num1 + " / " + num2 +  " = " + floor1);
    System.out.println(num1 + " % " + num2+ " = " +mod);
    System.out.println("\n" + num2 + " / " + num1 +  " = " + floor2);
    System.out.print(num2 + " % " + num1 +  " = " + mod2);

    




    }
    
}
