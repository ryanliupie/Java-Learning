// Take user input and display favourite OS 

import java.util.Scanner; // the "Scanner" class is used to get user input and it is found in java.util

public class EfficentInput {
    public static void main(String[] args) { // we do not need "OS.close()" in order to end the scanner because the "try" automatically does this. 
       try (Scanner os = new Scanner(System.in)) { // the Scanner class creates an object called "os" and "new Scanner(Sytem.in)" tells java to read input
            System.out.print("Enter your favourite Operating System: ");
            String name = os.nextLine(); // "OS.nextLine()" lets the user actually input a value and we hold that value in a String variable called "name". This is important because when we want to present this value to the user, we can because we held it in a variable called "name"
            System.out.println("" + name + " is a really cool OS man.");

        }
    }
}
