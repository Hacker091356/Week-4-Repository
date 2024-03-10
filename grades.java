//imports
import java.util.Scanner;
public class grades {
    public static void main(String[] args){
        //initialize scanner
        Scanner userInput = new Scanner(System.in);
        //Asking user to input 5 grades
        System.out.print("Enter 5 grades:");
        double grade1 = userInput.nextDouble();
        double grade2 = userInput.nextDouble();
        double grade3 = userInput.nextDouble();
        double grade4 = userInput.nextDouble();
        double grade5 = userInput.nextDouble();
        // closing scanner to avoid waste of resources
        userInput.close();
        // Finding the avg
        double avg = (grade1 + grade2 + grade3 + grade4 + grade5)/5;
        System.out.print("The average of the grades is: " + avg);
    
    
    
    }   
}
