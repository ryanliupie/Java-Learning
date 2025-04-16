import java.util.Random; 

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random(); // we do not need "System.in" because this tells java "this scanner should read what the user types" and in this case, we are not using any input
        
        int number; 
        int number2; 
        int number3; 

        number = random.nextInt(1, 300);
        number2 = random.nextInt(1, 300); 
        number3 = random.nextInt(1, 300);   

        System.out.print(number);
        System.out.print(number2); 
        System.out.print(number3);   


    }
}
