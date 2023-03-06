/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

package its.contrattoTelefono;

import java.util.ArrayList;

/* Classe Astratta per la creazione di nuovi utenti avente un contratto telefonico */
public abstract class ContrattoTelefonico {
    protected String numeroTelefono;        // Numero di telefono dell'utente
    protected String utenteNome, utenteCognome;     // Nome e cognome dell'utente

    /* Di seguito metodi getter e setter per gli attributi della classe stratta ContrattoTelefonico */
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getUtenteNome() {
        return utenteNome;
    }

    public void setUtenteNome(String utenteNome) {
        this.utenteNome = utenteNome;
    }

    public String getUtenteCognome() {
        return utenteCognome;
    }

    public void setUtenteCognome(String utenteCognome) {
        this.utenteCognome = utenteCognome;
    }

    /* Costruttore di default per istanziare nuovi contratti */
    protected ContrattoTelefonico(String numeroTelefono, String utenteNome, String utenteCognome) {
        setNumeroTelefono(numeroTelefono);
        setUtenteNome(utenteNome);
        setUtenteCognome(utenteCognome);
    }

    /* Calcola il costo di una singola chiamata in base alla sua durata, passata come parametro */
    public abstract double costoSingolo(double durataChiamata);

    /* Calcola il costo bolletta */
    public abstract double bolletta();

    /* Restituisce i dati della bolletta */
    public abstract String stampaBolletta();

    /* Restituisce l'utente ed il numero di telefono */
    @Override
    public String toString() {
        return "Utente: " + getUtenteNome() + " " + getUtenteCognome() + " - Numero: " + getNumeroTelefono();
    }
}

final class ContrattoFisso extends ContrattoTelefonico{
    private final double scattoRispostaFisso = 0.19, costoMinutoFisso = 0.08;       // Costi fissi per la bolletta

    private ArrayList<Double> bollettaFisso = new ArrayList<>();        // Creazione di un nuovo contenitore per gli importi delle bollette

    /* Restituisce l'ArrayList delle bollette */
        public ArrayList<Double> getBollettaFisso() {
        return bollettaFisso;
    }

    /* Costruttore per la classe ContrattoFisso, eredita gli attributi da ContrattoTelefonico */
        public ContrattoFisso(String numeroTelefono, String utenteNome, String utenteCognome) {
        super(numeroTelefono, utenteNome, utenteCognome);
    }

    /* Calcola e restituisce il costo della singola chiamata, contestualmente lo aggiunge al contenitore bollettaFisso */
    @Override
    public double costoSingolo(double durataChiamata) {
        double costoChiamata = (double) Math.round((scattoRispostaFisso + (costoMinutoFisso * durataChiamata)) * 100) / 100;        // Converte costoChiamata a due cifre decimali
        this.bollettaFisso.add(costoChiamata);
        return costoChiamata;
    }

    /* Calcola l'intero costo della bolletta, sommando tutti i valori contenuti nel contenitore bollettaFisso */
    @Override
    public double bolletta() {
        double totaleBolletta = 0;
        for (Double d : bollettaFisso) {
            totaleBolletta += d;
        }
        return totaleBolletta;
    }

    /* Stampa la bolletta, inserendo il numero delle telefonate, il costo per singola chiamata ed il costo totale della bolletta */
        @Override
    public String stampaBolletta() {
        return super.toString() +
                "\n Hai effettuato " + getBollettaFisso().size() + " chiamate."+
                "\n Il costo per chiamata \u00E8 stato: " + getBollettaFisso() +
                "%n Il costo totale della bolletta \u00E8: %,.2f".formatted(this.bolletta()) + " \u20AC";       // Stampa il valore formattato nella notazione #.###,##
    }
}

final class ContrattoMobile extends ContrattoTelefonico{
    private final double scattoRispostaMobile = 0.23, costoMinutoMobile = 0.09;     // Costi fissi per la bolletta
    private ArrayList<Double> bollettaMobile = new ArrayList<>();       // Creazione di un nuovo contenitore per gli importi delle bollette

    /* Restituisce l'ArrayList delle bollette */
    public ArrayList<Double> getBollettaMobile() {
        return bollettaMobile;
    }

    /* Costruttore per la classe ContrattoMobile, eredita gli attributi da ContrattoTelefonico */
    public ContrattoMobile(String numeroTelefono, String utenteNome, String utenteCognome) {
        super(numeroTelefono, utenteNome, utenteCognome);
    }

    /* Calcola e restituisce il costo della singola chiamata, contestualmente lo aggiunge al contenitore bollettaMobile */
    @Override
    public double costoSingolo(double durataChiamata) {
        double costoChiamata = (double) Math.round((scattoRispostaMobile + (costoMinutoMobile * durataChiamata)) * 100) / 100;      // Converte costoChiamata a due cifre decimali
        this.bollettaMobile.add(costoChiamata);
        return costoChiamata;
    }

    /* Calcola l'intero costo della bolletta, sommando tutti i valori contenuti nel contenitore bollettaMobile */
    @Override
    public double bolletta(){
        double totaleBolletta = 0;
        for (Double d : bollettaMobile) {
            totaleBolletta += d;
        }
        return totaleBolletta;
    }

    /* Stampa la bolletta, inserendo il numero delle telefonate, il costo per singola chiamata ed il costo totale della bolletta */
    @Override
    public String stampaBolletta() {
        return super.toString() +
                "\n Hai effettuato " + getBollettaMobile().size() + " chiamate."+
                "\n Il costo per chiamata \u00E8 stato: " + getBollettaMobile() +
                "%n Il costo totale della bolletta \u00E8: %,.2f".formatted(this.bolletta()) + " \u20AC"; // Stampa il valore formattato nella notazione #.###,##
    }
}