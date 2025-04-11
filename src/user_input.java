import java.util.Scanner; // the "Scanner" class is used to get user input and it is found in java.util

public class user_input {
    public static void main(String[] args) {

       Scanner cars = new Scanner(System.in); // the Scanner class creates an object called "cars" and "new Scanner(Sytem.in)" tells java to read input
       System.out.print("Enter your favourite car brand: ");
       String name = cars.nextLine(); // "cars.nextLine()" lets the user actually input a value and we hold that value in a String variable called "name". This is important because when we want to present this value to the user, we can because we held it in a variable called "name"
       System.out.println("" + name + " is a cool car brand!");  

        


       cars.close(); // this line closes the scanner which is good practice to free up system resources and you can't user the scanner again unless you create a new one
   }

}


