public class Cat {
    private String name;
    private int lifeExpectancy;
    private String favoriteFood;

    void run() {
        lifeExpectancy++;
        System.out.println("Run Run");
    }

    void meow() {
        System.out.println("Meow Meow");
    }

    public Cat(String name, int lifeExpectancy, String favoriteFood) {
        this.name = name;
        this.lifeExpectancy = lifeExpectancy;
        this.favoriteFood = favoriteFood;
    }



    @Override
    public String toString() {
        return "My Name is " + name + " I Like to Eat " + favoriteFood + " My Life Expectancy is " + lifeExpectancy;
    }
}
