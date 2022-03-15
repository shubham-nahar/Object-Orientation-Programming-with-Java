public class Athlete {

    //Normal Program without Static
    private String name;
    private int speed;
    /*
    Output:
    Athlete Mike is running at 10 miles per hour
    Athlete Betsy is running at 12 miles per hour
     */

    // Now Adding Variable Location
    // private String location; (1)
    /*
    Output:
    Athlete Mike is running at 10 miles per hour at Boston
    Athlete Betsy is running at 12 miles per hour at London
     */

    //Making Location Static
    private static String location; //(2)
    /*
    Output:
    Athlete Mike is running at 10 miles per hour at London
    Athlete Betsy is running at 12 miles per hour at London

    Location is set to one Location Once it is made Static
     */

    //(3)
    private int bibNumber;
    private static int runnerInRace;
    /*
    Output:

     */


    public Athlete(String name, int speed) {
        this.name = name;
        this.speed = speed;

        runnerInRace++;
        this.bibNumber = runnerInRace;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static int getRunnerInRace() {
        return runnerInRace;
    }

    @Override
    public String toString() {
        return "Athlete " +name+ " is running at " + speed + " miles per hour at "+location+ " " +bibNumber;
    }
}
