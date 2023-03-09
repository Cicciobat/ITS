/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

package its.Animali;

import java.util.ArrayList;

/*
 * Classe Zoo per la creazione di nuovi ArrayList di "Animali"
 */
public class Zoo {
    private ArrayList<Animale> animali; // ArrayList di Animali

    /*
     * Costruttore per la creazione di nuovi ArrayList di "Animali"
     */
    public Zoo() {
        setAnimali(new ArrayList<>());
    }       // Viene inizializzato l'ArrayList vuoto

    /*
     * Di seguito metodi getter and setter per gli attributi della classe
     */
    public ArrayList<Animale> getAnimali() {
        return animali;
    }

    public void setAnimali(ArrayList<Animale> animali) {
        this.animali = animali;
    }

    /*
     * Restituisce il verso dell'animale passato come parametro in base alla sua classe,
     * tre volte ne caso sia un cane e due volte nel caso sia un gatto
     */
    public void suonaVerso(Animale a) {
        if (a instanceof Cane) {
            for (int i = 0; i < 3; i++) {
                System.out.println(a.verso());
            }
        } else if (a instanceof Gatto) {
            for (int i = 0; i < 2; i++) {
                System.out.println(a.verso());
            }
        }
    }

    /*
     * Aggiunge l'animale passato come oggetto all'ArrayList "animali"
     */
    public void aggiungiAnimale(Animale a) {
        this.animali.add(a);
    }

    /*
     * Rimuove l'animale passato come oggetto dall'ArrayList "animali"
     */
    public void rimuoviAnimale(Animale a) {
        this.animali.remove(a);
    }

    /*
     * Stampa tutti gli animali presenti dentro l'ArrayList "animali"
     */
    public String stampaAnimali() {
        return animali.toString();
    }

    /*
     * Confronta due animali passati come parametro e restituisce quello con il peso maggiore.
     */
    public String confrontaAnimali(Animale a, Animale b) {
        if (a.getPeso() > b.getPeso()) {
            return "L'animale con il peso maggiore \u00E8: " + a;
        }
        else if (a.getPeso() == b.getPeso()) {
            return "I seguenti animali hanno lo stesso peso: " + a + "\n" + b;
        }
        else return "L'animale con il peso maggiore \u00E8: " + b;
    }
}