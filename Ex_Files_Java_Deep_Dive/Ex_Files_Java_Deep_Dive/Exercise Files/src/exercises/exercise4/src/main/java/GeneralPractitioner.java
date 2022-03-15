public class GeneralPractitioner extends Doctor{

    void makeHouseCalls(){
        System.out.println("Goes and Check the Patient at House. ");
    }

    @Override
    void doMedicine() {
        System.out.println("Gives the Medine to Patient at Home");
    }
}
