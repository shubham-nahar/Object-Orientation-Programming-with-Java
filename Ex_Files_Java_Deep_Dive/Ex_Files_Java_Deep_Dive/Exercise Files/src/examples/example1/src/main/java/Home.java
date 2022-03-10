public class Home {

    public static void main(String[] args) {
        Cat kittoCat = new Cat("Kitto", 80 / 4, "Sweet Corn");
        Cat jilmilCat = new Cat("Jilmil", 90/5, "Smashed Potato");


        System.out.println(kittoCat);

        kittoCat.meow();
        kittoCat.myName();
    }
}
