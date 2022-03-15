import java.util.ArrayList;

public class BetterArrayList<E> extends ArrayList<E> {


    public BetterArrayList(ArrayList<E> arrs) {
        this.addAll(arrs);
    }

    public void pop() {

        System.out.println("Element Poped is: " + this.remove(this.size()-1));
    }


    public void print() {
        System.out.println("New Array List: " +  this);
    }
}
