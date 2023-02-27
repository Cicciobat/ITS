package Database_Persone;

import java.util.ArrayList;

public class Database {

    private ArrayList<Persona> persone;

    public Database(ArrayList<Persona> persone) {
        this.persone = persone;
    }

    public static Database newDatabase(){
        ArrayList<Persona> persone = new ArrayList<>();

        return new Database(persone);
    }

    public ArrayList<Persona> getPersone() {
        return persone;
    }

    public void setPersone(ArrayList<Persona> persone) {
        this.persone = persone;
    }

    public void addUser(Persona persona){
        this.persone.add(persona);
    }

    public ArrayList<Persona> rimuoviMinorenni(ArrayList<Persona> persone){

        ArrayList<Persona> temp = new ArrayList<>();

        for (Persona p : persone) {
            if (p.getAge() >= 18){
                    temp.add(p);
            }
        }
        return temp;
    }

    public String cercaPersona(String nome, String cognome, ArrayList<Persona> persone){
        ArrayList<String> temp = new ArrayList<>();

        for (Persona p : persone) {
            if (p.getName().equals(nome) && p.getSurname().equals(cognome)){
                temp.add(p.getSurname());
            }
        }
        if (temp.size() >= 1){
            return "La ricerca ha prodotto i seguenti risultati: " + temp;
        }
        else return "La ricerca non ha prodotto risultati";
    }

    public String cercaPersona(ArrayList<Persona> persone, Persona persona){
        if (persone.contains(persona)){
            return "La persona da te selezionata corrisponde a: " + persona.toString();
        }
        else return "La ricerca non ha prodotto risultati";
    }

    public int getNumeroPersone(){
        return this.persone.size();
    }
}