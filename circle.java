import java.lang.Math;
public class circle {
    public static void main(String[] args){
        // Variables
        double radius = 4.28;
        // Finding the area and circumference using Math.PI
        double area = (radius * radius) * Math.PI;
        double circumference = (2 * radius) * Math.PI;
        //Printing results
        System.out.println("The area of the circle is " + area );
        System.out.println("The circumference is " + circumference);
    }

}
