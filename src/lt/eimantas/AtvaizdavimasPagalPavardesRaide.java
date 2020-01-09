package lt.eimantas;

import java.util.ArrayList;
import java.util.Scanner;

public class AtvaizdavimasPagalPavardesRaide {


    public void AtvaizdavimasIsSarasoPagalPavardesRaide(ArrayList<Person> eilutes) {
        Scanner sc = new Scanner(System.in);
        Character raide = null;
        System.out.println("Iveskite vartotojo pavardes pirma raide, apie kuri norite gauti informacija.");
        raide = sc.nextLine().toLowerCase().charAt(0);
        for (Person person : eilutes) {
            if (person.getSurname().toLowerCase().charAt(0) == raide) {
                System.out.println(person.getName() + " " + person.getSurname() + " " + person.getAge());
            }
        }
    }
}
