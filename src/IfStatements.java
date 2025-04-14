// Creator: Ryan Liu 
// Take user input and determine their age 
// 04/14/2025 


import java.util.Scanner; 

public class IfStatements {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String name;
            
            System.out.print("Enter your name: "); 
            name = scanner.nextLine();

            if (name.isEmpty()) {
                System.out.print("You did not enter a name, please try again");
                System.exit(0); // this is like "sys.exit()" in python, it takes the argument "0" because Java takes an integer to exit the program
            }

            else {
                System.out.println("Hello " + name +"!"); 
            }


            System.out.print("Enter your age: "); 
            int age = scanner.nextInt(); 

            if (age < 0) {
                System.out.print("You havent't been born yet."); 
            }

            else if (age <= 12) {
                System.out.print("You are still a kid " + name +", have lots of fun!");
            }
            
            else if (age >= 13 && age <= 19) { // this is cool, in java "&&" is used as "and". In python we only use "and". 
                System.out.print("Your a teenager, this is where you'll experience a lot emotions " + name + ", so take it easy okay?"); 
            } 

            else if (age >= 20 && age <= 30) {
                System.out.print("This is the age you have to work hard in when it comes to your relationships, career, hobbies, and everything that builds your character."); 
            }
            else {
                System.out.print("You've lived a long life, keep going!"); 
            }

        
        }
        
    }
}
