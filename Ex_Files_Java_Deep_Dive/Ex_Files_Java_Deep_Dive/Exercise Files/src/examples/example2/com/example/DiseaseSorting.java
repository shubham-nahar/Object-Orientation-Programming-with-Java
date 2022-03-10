package com.example;


import java.util.ArrayList;
import java.util.List;

public class DiseaseSorting {

    public static void main(String[] args) {
        Disease polio = new Disease("Polio", false);
        Disease flu = new Disease("Swine Flu", true);
        Disease malaria = new Disease("Malaria", true);
        Disease cancer = new Disease("Cancer", false);

        List<Disease> diseases = new ArrayList<>();
        diseases.add(polio);
        diseases.add(flu);
        diseases.add(malaria);
        diseases.add(cancer);

        // Output Before changing the Value
        // Curable Disease are:
        // Swine Flu
        // Malaria
        // Changing the Value of Cancer to True
        //Ways of Changing the Value in a Decalared Constructor:
        //Right Way In Order -> Go to Disease

        // 2nd Step
        cancer.setCurable(true); //Changing False to True

        /*
        Output After Changing the Value
        Curable Disease are:
        Swine Flu
        Malaria
        Cancer
         */
        System.out.println("Curable Disease are: ");
        for (Disease disease: diseases) {
            if (disease.isCurable()) {
                System.out.println(disease.getName());
            }
        }
    }
}
