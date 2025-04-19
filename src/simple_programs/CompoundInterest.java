// Creator: Ryan Liu
// 04/19/2025
// Calculate Compound Interest

import java.util.Scanner; 

public class CompoundInterest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Principal Amount: "); 
            double p = scanner.nextDouble(); 

            System.out.print("Annual Interest Rate (no %): "); 
            double r = scanner.nextDouble(); 

            System.out.print("Enter the # of times compounded per year: ");
            int n = scanner.nextInt(); 

            System.out.print("Enter the # of years: "); 
            int t = scanner.nextInt(); 
            
            double result; 

            result = p * Math.pow(1 + (r / n), (n * t)); // what we computed --> P * (1 + r/n) ^ (n*t)

           System.out.print("The amount after " + t + " years is $" + String.format("%.2f", result)); 
        }
    }
}
