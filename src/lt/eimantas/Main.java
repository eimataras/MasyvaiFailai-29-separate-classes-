package lt.eimantas;

import java.util.Scanner;

public class Main {
    Scanner sc;
    Integer meniu;

    public Main() {
        PersonController object = new PersonController();
        Integer arBaigtiMeniu = 1;

        do {
            System.out.println("Pasirinkite is MENIU ka norite atlikti:");
            System.out.println("1 - Vartotojų nuskaitymas iš failo, sudėjimas į sukurtą klasę \"Person\" ir atspausdinimas ekrane;");
            System.out.println("2 - Naujo vartotojo įrašymas į failą.");
            System.out.println("3 - Atvaizduoti vartotojus pagal prašomą vardą.");
            System.out.println("4 - Atvaizduoti vartotojus, kurių vardai prasideda prašoma raide.");
            System.out.println("5 - Atvaizduoti vartotojus, kurių pavardės prasideda prašoma raide.");
            System.out.println("6 - Atvaizduoti vartotojus, kurių amžius yra didesnis nei įvestas skaičius.");
            System.out.println("0 - BAIGTI DARBA.");
            sc = new Scanner(System.in);
            meniu = sc.nextInt();
            switch (meniu) {
                case 1: {
                    System.out.println("Vartotojai esantys faile: ");
                    object.skaitymasIsFailoISarasa();
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Ar baigti darba?");
                    System.out.println("0 - TAIP; 1 - MENIU.");
                    System.out.println("------------------------------------------------------------");
                    arBaigtiMeniu = sc.nextInt();
                    break;
                }
                case 2: {
                    object.irasymasIFaila();
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Ar baigti darba?");
                    System.out.println("0 - TAIP; 1 - MENIU.");
                    System.out.println("------------------------------------------------------------");
                    arBaigtiMeniu = sc.nextInt();
                    break;

                }
                case 3: {
                    object.skaitymasIrAtvaizdavimasPagalVarda();
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Ar baigti darba?");
                    System.out.println("0 - TAIP; 1 - MENIU.");
                    System.out.println("------------------------------------------------------------");
                    arBaigtiMeniu = sc.nextInt();
                    break;

                }
                case 4: {
                    object.skaitymasIrAtvaizdavimasPagalVardoRaide();
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Ar baigti darba?");
                    System.out.println("0 - TAIP; 1 - MENIU.");
                    System.out.println("------------------------------------------------------------");
                    arBaigtiMeniu = sc.nextInt();
                    break;

                }
                case 5: {
                    object.skaitymasIrAtvaizdavimasPagalPavardesRaide();
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Ar baigti darba?");
                    System.out.println("0 - TAIP; 1 - MENIU.");
                    System.out.println("------------------------------------------------------------");
                    arBaigtiMeniu = sc.nextInt();
                    break;

                }
                case 6: {
                    object.skaitymasIrAtvaizdavimasPagalAmziu();
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Ar baigti darba?");
                    System.out.println("0 - TAIP; 1 - MENIU.");
                    System.out.println("------------------------------------------------------------");
                    arBaigtiMeniu = sc.nextInt();
                    break;

                }
                case 0: {
                    arBaigtiMeniu = 0;
                    break;
                }
                default: {
                    System.out.println("Tokio pasirinkimo nera.");
                    arBaigtiMeniu = 1;
                    break;
                }
            }
        } while (arBaigtiMeniu != 0);
    }

    public static void main(String[] args) {
        // write your code here
        Main object = new Main();

    }
}
