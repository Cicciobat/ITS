/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

package Database_Persone;

import static Database_Persone.Database.*;

public class Eserc2 {

    public static void main(String[] args) {

        Database db = newDatabase();

        Persona p1 = new Persona("Ciccio", "Battaglia", "Male", 26);

        db.addUser(p1);

        Persona p2 = new Persona("Ciccio", "Battaglia", "Male", 17);

        db.addUser(p2);

        Persona p3 = new Persona("Mario", "Rossi", "Male", 17);

        db.addUser(p3);

        Persona p4 = new Persona("Carlo", "Bianchi", "Male", 17);

        db.addUser(p4);

        Persona p5 = new Persona("Giuseppe", "Verdi", "Male", 26);

        db.addUser(p5);

        Persona p6 = new Persona("Aldo", "Baglio", "Male", 17);

        db.addUser(p6);

        int InitialSizeOfDB = db.getNumeroPersone();

        System.out.println("Il Database è composto da: " + db.getPersone());

        System.out.println("\nIl Database senza minorenni è composto da: " + db.rimuoviMinorenni(db.getPersone()));

        System.out.println("\n" + db.cercaPersona(db.getPersone(), p2));

        System.out.println("\n" + db.cercaPersona("Ciccio", "Battaglia", db.getPersone()));

        int FinalSizeOfDB = db.getNumeroPersone();

        if (InitialSizeOfDB == FinalSizeOfDB) {
            System.out.println("\nIl numero di persone all'interno del database non e' cambiato");
        }else System.out.println("\nIl database contiene: " + db.getNumeroPersone() + " persona\\e");
    }
}