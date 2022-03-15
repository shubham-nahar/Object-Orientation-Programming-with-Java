import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
        Integer[] ints = new Integer[]{1,2,3,4,5};

        ArrayList<Integer> arrs = new ArrayList<>(Arrays.asList(ints));
        BetterArrayList<Integer> betterArrayList = new BetterArrayList<>(arrs);

        System.out.println("Array List: " + arrs);

        betterArrayList.pop();
        betterArrayList.print();

        betterArrayList.pop();
        betterArrayList.print();
    }
}
