//imports
import java.util.Scanner;
public class Temp {
    public static void main(String[] args){
        //initialize scanner
        Scanner userInput = new Scanner(System.in);
        // ASking for temp in F 
        System.out.print("Enter a temperature in Fahrenheit: ");
        double tempF = userInput.nextDouble();
        userInput.close();
        // Converting user input into degrees celsius
        double tempC = ((tempF - 32)*5)/9;
        //Displaying results 
        System.out.print("The temperature in degrees Celsius is: " + tempC);






        

        }
   
}
