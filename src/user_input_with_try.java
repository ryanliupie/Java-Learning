// Take user input and display favourite OS 
import java.util.Scanner;

public class user_input_with_try{
    public static void main(String[] args) { // we do not need "OS.close()" in order to end the scanner because the "try" automatically does this. 
       try (Scanner OS = new Scanner(System.in)) {
        System.out.print("Enter your favourite Operating System: ");
        String name = OS.nextLine();
        System.out.println("" + name + " is a really cool OS man.");

        }
    }
}
