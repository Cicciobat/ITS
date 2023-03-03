/* Made by Francesco Battaglia */

package Concessionaria;

public abstract class Veicolo {
    protected String marca, modello;
    protected int anno_fabbricazione;
    protected double cilindrata, prezzo;
    private static int count;       // Contatore per gli oggetti creati

    protected Veicolo(String marca, String modello, int anno_fabbricazione, double cilindrata, double prezzo) {        // Costruttore della classe genitore
        count++;    // Viene incrementato il contatore ogni volta che viene richiamato il costruttore
        this.marca = marca;
        this.modello = modello;
        this.anno_fabbricazione = anno_fabbricazione;
        this.cilindrata = cilindrata;
        this.prezzo = prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnno_fabbricazione() {
        return anno_fabbricazione;
    }

    public void setAnno_fabbricazione(int anno_fabbricazione) {
        this.anno_fabbricazione = anno_fabbricazione;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(float cilindrata) {
        this.cilindrata = cilindrata;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public abstract String getTipo();

    public double getPrezzoIVA() {      // Ritorna il prezzo del veicolo ivato
        return this.prezzo * 1.22;
    }

    public static int getNumeroVeicoli() {      // Metodo statico per ottenere il numero degli oggetti instanziati
        return count;
    }

    public String toString() {      // Stampa i dettagli del veicolo
        return  "\n\t Marca: " + getMarca() +
                "\n\t Modello: " + getModello() +
                "\n\t Anno di fabbricazione: " + getAnno_fabbricazione() +
                "%n\t Cilindrata: %.2f".formatted(getCilindrata()) + " cm\u00B3" +      // Stampa il valore formattato nella notazione #.###,##
                "%n\t Prezzo: %,.2f".formatted(getPrezzo()) + " \u20AC" +       // Stampa il valore formattato nella notazione #.###,##
                "%n\t Prezzo ivato: %,.2f".formatted(this.getPrezzoIVA()) + " \u20AC";  // Riferimento al getPrezzoIVA della classe, stampa il valore formattato nella notazione #.###,##
    }
}

class Auto extends Veicolo {
    private int numeroPorte;

    public Auto(String marca, String modello, int anno_fabbricazione, double cilindrata, double prezzo, int numeroPorte) {      // Costruttore della sottoclasse Auto, eredita gli attributi dalla classe genitore
        super(marca, modello, anno_fabbricazione, cilindrata, prezzo);
        this.numeroPorte = numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public int getnumeroPorte() {
        return numeroPorte;
    }

    public double getPrezzoIVA(int quantita) {      // Calcola il prezzo scontato per singola auto in base alla quantità inserita in ordine
        double prezzoScontato = super.getPrezzoIVA();

        for (int i = 0; i < quantita; i++) {
            double sconto = (prezzoScontato * 2) / 100;
            prezzoScontato -= sconto;
        } return prezzoScontato;
    }

    @Override
    public String getTipo() {       // Restituisce il nome della classe
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {      // Override della stampa dettagli del veicolo con implementazione metodi propri della sottoclasse
        return  "Categoria: " + getTipo() +
                super.toString() +      // Richiama il metodo stampa dettagli dalla classe genitore
                "\n\t Porte: " + getnumeroPorte();
    }
}

class Moto extends Veicolo{
    private boolean sidecar;

    public Moto(String marca, String modello, int anno_fabbricazione, double cilindrata, double prezzo, boolean sidecar) {  // Costruttore della sottoclasse Moto, eredita gli attributi dalla classe genitore
        super(marca, modello, anno_fabbricazione, cilindrata, prezzo);
        this.sidecar = sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }

    public boolean isSidecar() {
        return sidecar;
    }

    public String hasSidecar(){     // Restituisce Si o No se presente o meno il sidecar, implementazione su stampa dettagli
        if(isSidecar()){
            return "Si";
        } else return "No";
    }

    @Override
    public double getPrezzoIVA() {      // Override del metodo getPrezzoIVA con implementazione sconto se la moto possiede il Sidecar
        double prezzoIvato = super.getPrezzoIVA();
        double sconto = (prezzoIvato * 5) / 100;

        if (isSidecar()){
            return prezzoIvato - sconto;        // Applica uno sconto del 5% se presente il sidecar
        }
        else return prezzoIvato;
    }

    @Override
    public String getTipo() {       // Restituisce il nome della classe
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {      // Override della stampa dettagli del veicolo con implementazione metodi propri della sottoclasse
        return  "Categoria: " + getTipo() +
                super.toString() +      // Richiama il metodo stampa dettagli dalla classe genitore
                "\n\t Sidecar: " + hasSidecar();
    }
}