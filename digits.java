// Importing scanner
import java.util.Scanner;
public class digits {
    public static void main(String[] args){
        //Initialize scanner 
        Scanner userInput = new Scanner(System.in);
        //Ask for input
        System.out.print("Enter a 3 digit number:");
        int number = userInput.nextInt();
        userInput.close();
        int onesPlace = number % 10;
        int tensForCalculatingHundreds = (number - (onesPlace))%10;
        int tensPlace = (number % 100 - onesPlace)/ 10;
        int hundredsPlace = (number - onesPlace - tensForCalculatingHundreds)/100;
        //Displaying results
        System.out.println("The hundreds digit is: " + hundredsPlace);
        System.out.println("The tens digit is: " + tensPlace);
        System.out.println("The ones digit is: " + onesPlace);

        



    }
    
}
