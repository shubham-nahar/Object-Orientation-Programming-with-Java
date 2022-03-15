import java.util.Random;

public class Randomness {
    public static void main(String[] args) {

        //Functions in Random Java Parent Class
        /* Step 1
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
         */

        //Step 2 Making a new Class Extending Random and Creating a Function nextLetter()

        extraRandom random = new extraRandom();

        System.out.println(random.nextInt());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());

        //Not a Property or Function in Java Random Parent Class
        System.out.println(random.nextLetter());
    }
}
