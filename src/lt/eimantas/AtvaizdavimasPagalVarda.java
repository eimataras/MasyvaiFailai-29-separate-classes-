package lt.eimantas;

import java.util.ArrayList;
import java.util.Scanner;

public class AtvaizdavimasPagalVarda {


    public void atvaizdavimasIsSarasoPagalVarda(ArrayList<Person> eilutes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite vartotojo varda, apie kuri norite gauti informacija.");
        String vardas = sc.nextLine();
        for (Person person : eilutes) {
            if (person.getName().toLowerCase().equals(vardas.toLowerCase())) {
                System.out.println(person.getName() + " " + person.getSurname() + " " + person.getAge());
            }
        }
    }
}
