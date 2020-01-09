package lt.eimantas;

import java.io.FileWriter;
import java.util.Scanner;

public class IrasymasIFaila {

    public static final String FILE_NAME = "vartotojai.txt";


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
}
