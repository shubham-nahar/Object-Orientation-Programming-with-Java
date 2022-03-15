public class Marathon {

    public static void main(String[] args) {
        Athlete mike = new Athlete("Mike", 10);
        Athlete betsy = new Athlete("Betsy", 12);

        //Step2:
        mike.setLocation("Boston");
        betsy.setLocation("London");

        System.out.println(mike);
        System.out.println(betsy);

        //Printout Runner in Race
        System.out.println("Runners in Race " + Athlete.getRunnerInRace());

    }
}
