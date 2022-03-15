import java.util.List;

public class India {

    public static void main(String[] args) {

//        new State().dance();
//        new Karnataka().dance();
//        new Maharashtra().dance();

        State state = new State();
        Karnataka karnataka = new Karnataka();
        Maharashtra maharashtra = new Maharashtra();

        new State().dance();

        List<State> states = List.of(karnataka, maharashtra);

        for (State state2: states) {
            state2.dance();
        }
    }
}
