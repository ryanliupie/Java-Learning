// Creator: Ryan Liu 
// Area of a rectangle 

import java.util.Scanner; 

public class RectangleArea {
    public static void main(String[] args) {
        try (Scanner area = new Scanner (System.in)) {

            System.out.print("Enter the length: "); 
            double length = area.nextDouble(); 
            
            System.out.print("Enter the width: "); 
            double width = area.nextDouble(); 
            
            double result = length * width; // this is cool --> this works because java stored these variables as numbers from the user's input so this would say for example "result = 43.33 * 34.54"

            System.out.print("The area of the rectangle is " + String.format("%.2f", result) + " m^2"); // string methods like python
        }
    }
}
