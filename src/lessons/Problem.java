/* In this code there is a problem when we enter an age, the out put would be 

"Enter your age: 56
 Enter your favourite food: You are 56 years old.Your favourite food is"

Why this that? This is because when we enter an age, we click "enter" which leaves \n in the input 
buffer (where the user actually inputs values) so then p1.nextline() sees the "\n" as an input 
so then it would return an empty string with values we specified in the output statements.  

*/

import java.util.Scanner; 

public class Problem {
    
    public static void main(String[] args) {
        try (Scanner p1 = new Scanner(System.in)) {
            
            System.out.print("Enter your age: "); 
            int age = p1.nextInt();
            // THE FIX TO THE CLEAR THE INPUT BUFFER DOWN BELOW!!!
        //  p1.nextLine();  <------ the FIX!!, this consumes the left over newline (\n) to clear the input buffer so we can accept the actual input from the user  
            
            System.out.print("Enter your favourite food: "); 
            String food = p1.nextLine(); 
            
            System.out.println("You are " + age + " years old.");
            System.out.println("Your favourite food is "+ food + ".");  

            
        }

    }
}
