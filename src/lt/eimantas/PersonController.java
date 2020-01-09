package lt.eimantas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class PersonController {
    public static final String FILE_NAME = "vartotojai.txt";
    // -----------------Darbas su failu-----------------------------------


    private ArrayList<Person> eilutes = new ArrayList<>();


    public ArrayList<Person> getEilutes() {
        return eilutes;
    }

    public void setEilutes(ArrayList<Person> eilutes) {
        this.eilutes = eilutes;
    }


    public void skaitymasIsFailoISarasa() {
        try {
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
}
