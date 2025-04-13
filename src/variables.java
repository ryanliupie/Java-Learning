/* 

Primitive Data Types: these are built-in stored directly in memory (stack), meaning they store actual values which include --> int, double (like float but higher precision since it 64 bytes compared to 32 bytes which float is), and boolean
Another important data type used is "char" --> which represent a single character that must be enclosed with single ''. It has other use cases such as seeing the underlying unicode value (same as python chr())

Reference Data Types: hold memory addresses in the (stack) that points to the (heap). In this case, the value is a placeholder, it does not hold the actual data. It hold the memory address (a reference) which points to the acutal data/stored in the (heap). 
That data could be a string, array, or an object. 

*/

public class Variables {

    public static void main(String[] args) {

        int age = 21;
        double gpa = 3.8; 
        char grade = 'A';
        char number = '7';
        String name = "Ryan";
        String favSubject = "math"; 
        String favFood = "Vietnamese food";
        boolean forSale = false; //when dealing with variables with multiple names, the first one must be lowercase, followed by the second one being uppercase  
        System.out.println("I am " + age + ", and my gpa is " + gpa); 
        System.out.println(grade + number); // Unicode value 65 + 55 = 120, if you did "" + ... it would treat it as a string which results in "A7"
        
        if(forSale){ // this is like "if forSale is true", a shorter version 
            System.out.println("" + favFood + " is for sale");
        }
        else{
           System.out.println("" + favFood + " is not for sale");  
        }
        System.out.println("my name is " + name + ", and you know I am already 21 years old.\nA fact about me is that my favourite subject is " + favSubject + ".");
    }
}