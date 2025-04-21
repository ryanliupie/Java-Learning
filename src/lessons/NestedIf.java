public class NestedIf {
    public static void main(String[] args) {
        
        boolean isStudent = true;
        boolean isSenior = true; 
        double price = 9.99;
        
        if (isStudent) { // if you are a student and a senior, you get a discount of 30% 
            if(isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%"); 
                price*= 0.7;
            } 
            else {
                System.out.println("You get a student discount of 10%"); 
            price *= 0.9;
            }    
            
        }
        else {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8; 
            }
        }
        System.out.println("The price of the ticket is $" + String.format("%.2f", price)); 
    } 
}
