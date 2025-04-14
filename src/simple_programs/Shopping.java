// Creator: Ryan Liu
// Shopping cart game
// 04/14/2025


import java.util.Scanner; 

public class Shopping {
    public static void main(String[] args) {
        try (Scanner store = new Scanner(System.in)) {
            
            System.out.print("What food item would you like to buy?: "); 
            String item = store.nextLine(); 

            System.out.print("What is the price of item or items?: "); 
            double price = store.nextDouble(); 

            System.out.print("How many would you like?: ");
            double amt = store.nextDouble(); 
            
            double result = price * amt;
            
            System.out.println("The item you are buying is " + item + "and the total amount you own is $" + String.format("%.1f", result));
        

        }
    }
}
