package lt.eimantas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonController {
    public static final String FILE_NAME = "vartotojai.txt";
    // -----------------Darbas su failu-----------------------------------

    ArrayList<Person> eilutes;


    public void skaitymasIsFailoISarasa() {
        try {
            eilutes = new ArrayList<>();
            FileReader _in = new FileReader(FILE_NAME);
            BufferedReader _bufferis = new BufferedReader(_in);
            String eilute = _bufferis.readLine();
            while (eilute != null) {
                String[] duom = eilute.split(" ");
                String name = duom[0];
                String surname = duom[1];
                Integer age = Integer.parseInt(duom[2]);

                Person zmogus = new Person(name, surname, age);
                eilutes.add(zmogus);
                eilute = _bufferis.readLine();
                System.out.println(zmogus.name + " " + zmogus.surname + " " + zmogus.age);
            }
            _bufferis.close();
            _in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void irasymasIFaila() {
        //String eilute = vardas + " " + pavarde + " " + amzius + "\n";
        System.out.println("Iveskite naują vartotoją.");
        String vardas;
        String pavarde;
        String amzius;
        Scanner _sc = new Scanner(System.in);
        Integer arBaigti;
        do {
            //----------VARDO IVEDIMAS-------------------------------------
            System.out.println("Iveskite vardą ir spauskite 'Enter'");
            vardas = _sc.nextLine();
            try {
                FileWriter _out = new FileWriter(FILE_NAME, true);
                _out.write(vardas);
                _out.write(" ");
                _out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            //----------PAVARDES IVEDIMAS-------------------------------------
            System.out.println("Iveskite pavardę ir spauskite 'Enter'");
            pavarde = _sc.nextLine();
            try {
                FileWriter _out = new FileWriter(FILE_NAME, true);
                _out.write(pavarde);
                _out.write(" ");
                _out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            //----------AMZIAUS IVEDIMAS-------------------------------------
            System.out.println("Iveskite amžių ir spauskite 'Enter'");
            Integer arSkaicius = null;
            while (arSkaicius == null) {
                amzius = _sc.nextLine();
                try {
                    arSkaicius = Integer.parseInt(amzius);
                    try {
                        FileWriter _out = new FileWriter(FILE_NAME, true);
                        _out.write(amzius);
                        _out.write('\n');
                        _out.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    System.out.println("Neteisingai ivestas amzius. Iveskite amziu.");
                }
            }

            //----------BAIGTI DARBA AR KARTOTI?-------------------------------------
            String atsakymas;
            System.out.println("Vartotojas įvestas sėkmingai.");
            System.out.println("1 - Ivesti kita vartotoja.");
            System.out.println("0 - Baigti ivedima.");
            atsakymas = _sc.nextLine();
            try {
                arBaigti = Integer.parseInt(atsakymas);
            } catch (Exception e) {
                arBaigti = 0;
            }
        } while (arBaigti == 1);
    }

    public void skaitymasIrAtvaizdavimasPagalVarda() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite vartotojo varda, apie kuri norite gauti informacija.");
        String vardas = sc.nextLine();
        for (Person person: this.eilutes ) {
            if(person.getName().toLowerCase().equals(vardas.toLowerCase())){
                System.out.println(person.getName() + " "+ person.getSurname()+ " "+person.getAge());
            }
        }


    }

    public void skaitymasIrAtvaizdavimasPagalVardoRaide() {
        Scanner sc = new Scanner(System.in);
        Character raide = null;
        System.out.println("Iveskite vartotojo vardo pirma raide, apie kuri norite gauti informacija.");
        raide = sc.nextLine().toLowerCase().charAt(0);
        for (Person person: this.eilutes ) {
            if(person.getName().toLowerCase().charAt(0) == raide){
                System.out.println(person.getName() + " "+ person.getSurname()+ " "+person.getAge());
            }
        }
    }

    public void skaitymasIrAtvaizdavimasPagalPavardesRaide() {
        Scanner sc = new Scanner(System.in);
        Character raide = null;
        System.out.println("Iveskite vartotojo pavardes pirma raide, apie kuri norite gauti informacija.");
        raide = sc.nextLine().toLowerCase().charAt(0);
        for (Person person: this.eilutes ) {
            if(person.getSurname().toLowerCase().charAt(0) == raide){
                System.out.println(person.getName() + " "+ person.getSurname()+ " "+person.getAge());
            }
        }
    }

    public void skaitymasIrAtvaizdavimasPagalAmziu() {
        Scanner sc = new Scanner(System.in);
        Integer amzius = null;
        System.out.println("Iveskite amziu ir gausite vyresnius vartotojus nei ivestas amzius.");
        amzius = sc.nextInt();
        for (Person person: this.eilutes ) {
            if(person.getAge() > amzius){
                System.out.println(person.getName() + " "+ person.getSurname()+ " "+person.getAge());
            }
        }
    }


}
