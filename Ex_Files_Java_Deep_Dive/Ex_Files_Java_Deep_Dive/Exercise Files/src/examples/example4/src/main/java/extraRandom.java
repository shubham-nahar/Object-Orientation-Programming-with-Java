import java.util.Random;

public class extraRandom extends Random {


    public String nextLetter() {
        int lettersStartAt = 97; // 97 is ASCII Value for 'a'
        int randomInt = new Random().nextInt(26) + lettersStartAt;
        return "" + (char) randomInt;
    }
}
