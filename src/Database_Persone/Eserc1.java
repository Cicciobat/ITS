package Database_Persone;

public class Eserc1 {

    public static int incrementaEta(Persona persona){

        persona.setAge(persona.getAge()+1);

        return persona.getAge();
    }

    public static String cambiaNome (Persona persona, String new_name){
        if (persona.getName().equals(new_name)){
            System.out.println("Il nome inserito è uguale al precedente");
        }
        else{
            persona.setName(new_name);
            System.out.println("Nome aggiornato!");}

        return persona.getName();
    }

    public static String stampaDettagli(Persona persona){
        return persona.toString().toUpperCase();
    }

    public static boolean controllaEta(Persona persona){
        if (persona.getAge() >= 18){
            return true;
        }
        else return false;
    }


    public static void main(String[] args) {
        Persona persona1 = new Persona("Ciccio", "Battaglia", "Male", 26);

        System.out.println(persona1);

        incrementaEta(persona1);

        cambiaNome(persona1, "Francesco");

        boolean isMaggiorenne = controllaEta(persona1);

        if (isMaggiorenne)
            System.out.println("L'utente è maggiorenne.");

        System.out.println(stampaDettagli(persona1));
    }

}
