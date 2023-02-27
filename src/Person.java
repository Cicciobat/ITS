import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Person { // Viene creata la classe Persona con gli attributi nome, cognome, eta', data di nascita, indirizzo;
    String name, surname, age, bday, address;

    public String getName(){
        return this.name;
    }


    public void getAllData() {
        System.out.println(this.name + " " + this.surname + ", " + this.age + ", " + this.bday + ", " + this.address);
    }

    public Person(String name, String surname, String age, String bday, String address) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.bday = bday;
        this.address = address;
    }

    /**
     * Insert data
     */
    public static Person insertData() throws IOException {
        String en_name, en_surname,en_age, en_bday, en_address;

        BufferedReader tast = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Inserisci il nome: ");
        en_name = tast.readLine();

        System.out.println("Inserisci il cognome: ");
        en_surname = tast.readLine();

        System.out.println("Inserisci l'eta': ");
        en_age = tast.readLine();

        System.out.println("Inserisci la data di nascita: ");
        en_bday = tast.readLine();

        System.out.println("Inserisci il l'indirizzo: ");
        en_address = tast.readLine();

        return new Person(en_name, en_surname, en_age, en_bday, en_address);
    }

    static class MorePerson extends Person{

        public MorePerson(String name, String surname, String age, String bday, String address) {
            super(name, surname, age, bday, address);

        }
    }
    public static void main(String[] args) throws IOException {
        final int LENGHT = 10;

        List<Person> persona = new ArrayList<Person>();
        persona.add(insertData());


        }
    }