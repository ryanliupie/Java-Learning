public class PrintF {
    public static void main(String[] args) {
        
   // printf() = is a method used to format output 

   // % [flags] [width] [.precision] [specifier-character]

      String name = "Ryan";
      char firstLetter = 'S'; 
      int age = 21; 
      double weight = 220.5; 
      boolean isEmployed = true; 

   // anything with "%" is a [specifier character]

      System.out.printf("Hello %s\n", name); // the "%" is a placeholder to hold the value of the variable and in this case, "s" refers to a string. Instead of concatenation " + name" we do ", name". There is more control to this especially if you are combining the output with multiple specifiers
      System.out.printf("Superman starts with an %c\n", firstLetter); 
      System.out.printf("I am %d years old\n", age);
      System.out.printf("I have bulked my weight to %f pounds\n", weight);  
      System.out.printf("Is Ryan Employed?: %b\n", isEmployed); 
   
   // lets try using multiple specifier characters

      System.out.printf("My name is %s and I am %d years old! I am also %f pounds lean muscle mass.\n", name, age, weight); 
   
  // lets now display how many digits we would like after a decimal with [.precision] --> we know how to do this because of "String.format"
  
  // also, lets add on some different [flags]

  // + = output a plus 
  // , = lets us add a comma between numbers to make the price more easily readable 
  // ( = the "(" is used to specific negative values 
  // space = displays a "-" if negative and a "space" when outputed when positive

      double price1 = 119.99;
      double price2 = 3500.654455; 
      double price3 = -76.5433; 
      double price4 = 12.99; 
      
      System.out.printf("%+.1f\n", price1); 
      System.out.printf("%,.2f\n", price2); 
      System.out.printf("%(.3f\n", price3); 
      System.out.printf("% .1f\n", price4); 

  // the last specifier is [width]

  // 0 = this adds zero padding (amount of zeros before number or value based on how many spaces you specify)
  // number = so we can just remove the "0" like before and keep the value which specifies how many spaces we can insert before number --> right justfied  
  // negative number = Same thing, but now if we insert a negative with the number it would be --> left justified 
      
      int id1 = 5;  
      int id2 = 10;  
      int id3 = 456; 
      int id4 = 7890;  

      System.out.printf("%04d\n", id1); 
      System.out.printf("%4d\n", id2); 
      System.out.printf("%-4d\n", id3); 
      System.out.printf("%4d\n", id4);    
    }
}
