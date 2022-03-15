public class DoctorMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        GeneralPractitioner generalPractitioner = new GeneralPractitioner();
        Surgeon surgeon = new Surgeon();

        generalPractitioner.makeHouseCalls();
        generalPractitioner.doMedicine();

        surgeon.performSurgery();
        surgeon.doMedicine();

        doctor.doMedicine();
    }
}
