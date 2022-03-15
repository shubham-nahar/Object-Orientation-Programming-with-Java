public class Surgeon extends Doctor {

    void performSurgery(){
        System.out.println("Doctor Performing Surgery");
    }

    @Override
    void doMedicine() {
        System.out.println("Nurse Gives Medicine");
    }
}
