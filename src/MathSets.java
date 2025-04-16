public class MathSets {
    public static void main(String[] args) {
        
        //System.out.println(Math.PI); 
        //System.out.println(Math.E); 

        double result; // creates a variable, we dont give it a value 

        result = Math.pow( 2, 4); // Here we manipulate the variables for different values we can specify
        result = Math.abs(-23); 
        result = Math.sqrt(9);
        result = Math.round(3.14); // this is like "String.format" but less control 
        result = Math.ceil(3.14); // this rounds up so it would be 4 even though it is closer to 3 
        result = Math.floor(4.95); // rounds down so it would be 4 even though it is closer to 5
        result = Math.max(30, 40); // founds the maximum number between values
        result = Math.min(5, 60); // finds the minimum number between values  
        
        
        System.out.print(result); 
    }
}
