// Creator: Ryan Liu 
// Find the hypotenuse and take user input 
// 04/16/2025 

import java.util.Scanner; 

public class Hypotenuse { 
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the length of side A: "); 
            double a = scanner.nextDouble();

            System.out.print("Enter the length of side B: "); 
            double b = scanner.nextDouble();

            double result; 
            
            result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); 

            System.out.print("The hypotenuse of the triangle is " + String.format("%.2f", result) + "m"); 
        }

    }
    
}
