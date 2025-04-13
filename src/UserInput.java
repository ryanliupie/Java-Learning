
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        try (Scanner computer = new Scanner(System.in)) { // remember that the object is what you manipulate or interact with
            System.out.print("What computer brand is your favourite?: ");
            String brand = computer.nextLine(); // how we accept a string 
            System.out.println("Damnn man, the " + brand + " brand is great!");
            
            System.out.print("How old is the computer?: "); 
            int age = computer.nextInt(); // how we accept an integer 
            if (age >= 4){
                System.out.println("It is getting a bit old, might need to upgrade soon."); 
            }
            else{
                System.out.println("It is relatively new."); 
            }

            System.out.print("What is your GPA?: ");
            double grade = computer.nextDouble(); // accepting a "double" 
            System.out.println("Your GPA is: " + grade); 

            System.out.print("Are you a student? (true/false): "); 
            boolean stu = computer.nextBoolean(); // this is cool because Java actually expects the user to input either "true" or "false", it is not like python where we can do like "if user == 'Yes'" etc.. it has to be these values so even if i did "yes/no" or "happy/sad" as boolean values, it would not work since Java is statically typed, while Python is dynamically typed. 
            if (stu) {
                System.out.print("You are a Student"); 
            }
            else {
                System.out.println("You are not a student"); 
            }
            




        }
    }
}
