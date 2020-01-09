package lt.eimantas;

import java.util.ArrayList;
import java.util.Scanner;

public class AtvaizdavimasPagalAmziu {


    public void AtvaizdavimasIsSarasoPagalAmziu(ArrayList<Person> eilutes) {
        Scanner sc = new Scanner(System.in);
        Integer amzius = null;
        System.out.println("Iveskite amziu ir gausite vyresnius vartotojus nei ivestas amzius.");
        amzius = sc.nextInt();
        for (Person person : eilutes) {
            if (person.getAge() > amzius) {
                System.out.println(person.getName() + " " + person.getSurname() + " " + person.getAge());
            }
        }
    }
}
